package co.com.choucair.signup.utest.tasks;

import co.com.choucair.signup.utest.userinterface.EtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Go implements Task {

    private EtestPage etestPage;

    public static Go thePage() {
        return Tasks.instrumented(Go.class);
    }

    // Execute all actions of our tests
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(etestPage));
    }
}
