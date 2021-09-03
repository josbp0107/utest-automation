package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.model.UTestRegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.signup.utest.userinterface.StepTwoPage.*;

public class StepTwo implements Task {
    UTestRegisterData uTestRegisterData;

    public StepTwo(UTestRegisterData uTestRegisterData) {
        this.uTestRegisterData = uTestRegisterData;
    }

    public static StepTwo addLocation(UTestRegisterData uTestRegisterData) {
        return Tasks.instrumented(StepTwo.class, uTestRegisterData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestRegisterData.getCity()).into(CITY),
                Click.on(LIST_CITY),
                Enter.theValue(uTestRegisterData.getZipCode()).into(ZIP_CODE),
                Click.on(DEVICE_BUTTON)
                );
    }
}
