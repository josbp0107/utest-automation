package co.com.choucair.signup.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.signup.utest.userinterface.StepThreePage.*;

public class StepThree implements Task {


    public static StepThree addDevices() {
        return Tasks.instrumented(StepThree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BRAND_FIELD),
                Click.on(SELECT_BRAND),
                Click.on(MODEL_FIELD),
                Click.on(SELECT_MODEL),
                Click.on(OS_FIELD),
                Click.on(SELECT_OS),
                Click.on(LAST_STEP_BUTTON)
        );
    }
}
