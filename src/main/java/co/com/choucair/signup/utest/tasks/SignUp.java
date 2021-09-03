package co.com.choucair.signup.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.signup.utest.userinterface.UTestSignUpPage.SIGNUP_BUTTON;

public class SignUp implements Task {
    public static SignUp onThePage(){
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SIGNUP_BUTTON));
    }
}
