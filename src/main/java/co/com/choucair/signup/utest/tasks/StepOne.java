package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.model.UTestRegisterData;
import co.com.choucair.signup.utest.util.GenerateData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.signup.utest.userinterface.StepOnePage.*;

public class StepOne implements Task {
    UTestRegisterData uTestRegisterData;

    public StepOne(UTestRegisterData uTestRegisterData) {
        this.uTestRegisterData = uTestRegisterData;
    }

    GenerateData gd = new GenerateData();

    public static StepOne addBasicInformation(UTestRegisterData uTestRegisterData) {
        return Tasks.instrumented(StepOne.class,uTestRegisterData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestRegisterData.getFirstName()).into(FIRST_NAME),
                Enter.theValue(uTestRegisterData.getLastName()).into(LAST_NAME),
                Enter.theValue(uTestRegisterData.getEmail()).into(EMAIL_ADDRESS),
                SelectFromOptions.byValue(gd.month()).from(BIRTH_MONTH),
                SelectFromOptions.byValue(gd.day()).from(BIRTH_DAY),
                SelectFromOptions.byValue(gd.year()).from(BIRTH_YEAR),
                Enter.theValue(uTestRegisterData.getLanguage()).into(LANGUAGES),
                Click.on(SELECT_LANGUAGE),
                Click.on(NEXT_BUTTON)
        );
    }
}
