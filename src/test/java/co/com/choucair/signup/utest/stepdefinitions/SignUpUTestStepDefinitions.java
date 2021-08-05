package co.com.choucair.signup.utest.stepdefinitions;

import co.com.choucair.signup.utest.tasks.Go;
import co.com.choucair.signup.utest.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Juan").wasAbleTo(Go.thePage(), (SignUp.onThePage()));
    }

    @When("^he enters each data in the different inputs$")
    public void heEntersEachDataInTheDifferentInputs() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^he fill all inputs and go next step$")
    public void heFillAllInputsAndGoNextStep() {
        // Write code here that turns the phrase above into concrete actions

    }


}
