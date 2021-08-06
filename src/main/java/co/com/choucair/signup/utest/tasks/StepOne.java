package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.userinterface.StepOnePage;
import co.com.choucair.signup.utest.util.GenerateData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class StepOne implements Task {

    GenerateData gd = new GenerateData();

    public static StepOne addData() {
        return Tasks.instrumented(StepOne.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(gd.firstName()).into(StepOnePage.FIRST_NAME),
                Enter.theValue(gd.lastName()).into(StepOnePage.LAST_NAME),
                Enter.theValue(gd.email()).into(StepOnePage.EMAIL_ADDRESS),
                SelectFromOptions.byValue(gd.month()).from(StepOnePage.BIRTH_MONTH),
                SelectFromOptions.byValue(gd.day()).from(StepOnePage.BIRTH_DAY),
                SelectFromOptions.byValue(gd.year()).from(StepOnePage.BIRTH_YEAR),
                Enter.theValue("Spanish").into(StepOnePage.LANGUAGES),
                Click.on(StepOnePage.SELECT_LANGUAGE),
                Click.on(StepOnePage.NEXT_BUTTON)
        );
    }
}
