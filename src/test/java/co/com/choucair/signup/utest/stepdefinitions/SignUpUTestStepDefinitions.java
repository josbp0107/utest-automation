package co.com.choucair.signup.utest.stepdefinitions;

import co.com.choucair.signup.utest.model.UTestRegisterData;
import co.com.choucair.signup.utest.questions.Answer;
import co.com.choucair.signup.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SignUpUTestStepDefinitions {

    // Sets scenario for our actor
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to register at Utest$")
    public void thanJuanWantsToRegisterAtUtest() {
        OnStage.theActorCalled("Juan").wasAbleTo(Go.thePage(), (SignUp.onThePage()));
    }

    @When("^he enters each data in the different inputs$")
    public void heEntersEachDataInTheDifferentInputs(List<UTestRegisterData> uTestRegisterDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                StepOne.addData(uTestRegisterDataList.get(0).getFirstName(),uTestRegisterDataList.get(0).getLastName(), uTestRegisterDataList.get(0).getEmail(),uTestRegisterDataList.get(0).getLanguage()),
                StepTwo.addAddress(uTestRegisterDataList.get(0).getCity(), uTestRegisterDataList.get(0).getZipCode()),
                StepThree.addDevices(),
                StepFour.addPassword(uTestRegisterDataList.get(0).getPassword(), uTestRegisterDataList.get(0).getConfirmPassword())
        );
    }

    @Then("^he fill all fields and completes the registration and redirects to the home page$")
    public void heFillAllFieldsAndCompletesTheRegistrationAndRedirectsToTheHomePage(List<UTestRegisterData> uTestRegisterDataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.value(uTestRegisterDataList.get(0).getWelcome())));
    }


}
