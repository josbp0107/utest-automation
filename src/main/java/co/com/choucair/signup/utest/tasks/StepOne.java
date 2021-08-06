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
    private String firstName;
    private String lastName;
    private String email;
    private String language;

    public StepOne(String firstName, String lastName, String email, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.language = language;
    }

    GenerateData gd = new GenerateData();

    public static StepOne addData(String firstName, String lastName, String email, String language) {
        return Tasks.instrumented(StepOne.class, firstName, lastName, email, language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(StepOnePage.FIRST_NAME),
                Enter.theValue(lastName).into(StepOnePage.LAST_NAME),
                Enter.theValue(email).into(StepOnePage.EMAIL_ADDRESS),
                SelectFromOptions.byValue(gd.month()).from(StepOnePage.BIRTH_MONTH),
                SelectFromOptions.byValue(gd.day()).from(StepOnePage.BIRTH_DAY),
                SelectFromOptions.byValue(gd.year()).from(StepOnePage.BIRTH_YEAR),
                Enter.theValue(language).into(StepOnePage.LANGUAGES),
                Click.on(StepOnePage.SELECT_LANGUAGE),
                Click.on(StepOnePage.NEXT_BUTTON)
        );
    }
}
