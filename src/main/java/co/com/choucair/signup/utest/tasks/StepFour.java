package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.userinterface.StepFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;


public class StepFour implements Task {

    private String password;
    private String confirmPassword;

    public StepFour(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static StepFour addPassword(String password, String confirmPassword) {
        return Tasks.instrumented(StepFour.class, password, confirmPassword);
    }

    public static char[] password(){
        int length = 16;
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-/.^&*_!@%=+>)";
        Random rd = new Random();
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = letters.charAt(rd.nextInt(letters.length()));
        }
        return password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //char[] password = password();
        actor.attemptsTo(Enter.theValue(password).into(StepFourPage.PASSWORD),
                Enter.theValue(confirmPassword).into(StepFourPage.CONFIRM_PASSWORD),
                Click.on(StepFourPage.STAY_INFORMED),
                Click.on(StepFourPage.TERM_USE),
                Click.on(StepFourPage.PRIVACITY_SETTING),
                Click.on(StepFourPage.COMPLETE_BUTTON)
        );
    }
}
