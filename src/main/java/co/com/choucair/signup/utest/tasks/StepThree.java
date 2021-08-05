package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.userinterface.StepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class StepThree implements Task {


    public static StepThree addDevices() {
        return Tasks.instrumented(StepThree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StepThreePage.BRAND_FIELD),
                Click.on(StepThreePage.SELECT_BRAND),
                Click.on(StepThreePage.MODEL_FIELD),
                Click.on(StepThreePage.SELECT_MODEL),
                Click.on(StepThreePage.OS_FIELD),
                Click.on(StepThreePage.SELECT_OS),
                Click.on(StepThreePage.LAST_STEP_BUTTON)
        );
    }
}
