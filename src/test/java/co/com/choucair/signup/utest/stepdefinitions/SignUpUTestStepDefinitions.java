package co.com.choucair.signup.utest.stepdefinitions;

import co.com.choucair.signup.utest.questions.Answer;
import co.com.choucair.signup.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

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
    public void heEntersEachDataInTheDifferentInputs() {
        OnStage.theActorInTheSpotlight().attemptsTo(StepOne.addData(), StepTwo.addAddress(), StepThree.addDevices(), StepFour.addPassword());
    }

    @Then("^he fill all fields and completes the registration$")
    public void heFillAllFieldsAndCompletesTheRegistration() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.value()));
    }


}
