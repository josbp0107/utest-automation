package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SignUp implements Task {
    public static SignUp onThePage(){
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestSignUpPage.SIGNUP_BUTTON));
    }
}
