package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.model.UTestRegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.signup.utest.userinterface.StepFourPage.*;

public class StepFour implements Task {
    UTestRegisterData uTestRegisterData;

    public StepFour(UTestRegisterData uTestRegisterData) {
        this.uTestRegisterData = uTestRegisterData;
    }

    public static StepFour addPassword(UTestRegisterData uTestRegisterData) {
        return Tasks.instrumented(StepFour.class, uTestRegisterData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestRegisterData.getPassword()).into(PASSWORD),
                Enter.theValue(uTestRegisterData.getConfirmPassword()).into(CONFIRM_PASSWORD),
                Click.on(STAY_INFORMED),
                Click.on(TERM_USE),
                Click.on(PRIVACITY_SETTING),
                Click.on(COMPLETE_BUTTON)
        );
    }
}
