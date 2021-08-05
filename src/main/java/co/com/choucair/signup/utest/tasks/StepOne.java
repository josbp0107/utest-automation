package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.userinterface.StepOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class StepOne implements Task {

    public static StepOne addData() {
        return Tasks.instrumented(StepOne.class);
    }

    public static String generateMonth(){
        String month = "number:";
        int number = (int)(Math.random()*(12)+1);
        return month+number;
    }

    public static String generateDay(){
        String day = "number:";
        int number = (int)(Math.random()*(28)+1);
        return day+number;
    }

    public static String generateYear(){
        String year = "number:";
        int number = (int)(Math.random()*((2003 - 1872) + 1)) + 1872;
        return year+number;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Jose").into(StepOnePage.FIRST_NAME),
                Enter.theValue("David").into(StepOnePage.LAST_NAME),
                Enter.theValue("jose@jose.com").into(StepOnePage.EMAIL_ADDRESS),
                SelectFromOptions.byValue(generateMonth()).from(StepOnePage.BIRTH_MONTH),
                SelectFromOptions.byValue(generateDay()).from(StepOnePage.BIRTH_DAY),
                SelectFromOptions.byValue(generateYear()).from(StepOnePage.BIRTH_YEAR),
                Enter.theValue("Spanish").into(StepOnePage.LANGUAGES),
                Click.on(StepOnePage.SELECT_LANGUAGE),
                Click.on(StepOnePage.NEXT_BUTTON)
        );
    }
}
