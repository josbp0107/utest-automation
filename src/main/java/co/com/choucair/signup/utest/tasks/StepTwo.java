package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.userinterface.StepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepTwo implements Task {

    public static StepTwo addAddress() {
        return Tasks.instrumented(StepTwo.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Sincelejo").into(StepTwoPage.CITY),
                Click.on(StepTwoPage.LIST_CITY),
                Enter.theValue("700001").into(StepTwoPage.ZIP_CODE),
                Click.on(StepTwoPage.DEVICE_BUTTON)
                );
    }
}
