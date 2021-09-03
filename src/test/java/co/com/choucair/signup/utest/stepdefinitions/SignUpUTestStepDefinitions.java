package co.com.choucair.signup.utest.stepdefinitions;

import co.com.choucair.signup.utest.model.UTestRegisterData;
import co.com.choucair.signup.utest.questions.Answer;
import co.com.choucair.signup.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SignUpUTestStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to register at Utest$")
    public void thanJuanWantsToRegisterAtUtest() {
        theActorCalled("Juan").wasAbleTo(Go.thePage(), (SignUp.onThePage()));
    }

    @When("^he enters each data in the different inputs$")
    public void heEntersEachDataInTheDifferentInputs(List<UTestRegisterData> uTestRegisterDataList) {
        theActorInTheSpotlight().attemptsTo(
                StepOne.addBasicInformation(uTestRegisterDataList.get(0)),
                StepTwo.addLocation(uTestRegisterDataList.get(0)),
                StepThree.addDevices(),
                StepFour.addPassword(uTestRegisterDataList.get(0))
        );
    }

    @Then("^he fill all fields and completes the registration and redirects to the home page$")
    public void heFillAllFieldsAndCompletesTheRegistrationAndRedirectsToTheHomePage(List<UTestRegisterData> uTestRegisterDataList) {
        theActorInTheSpotlight().should(seeThat(Answer.value(uTestRegisterDataList.get(0).getWelcome())));
    }


}
