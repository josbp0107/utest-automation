package co.com.choucair.signup.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {
    public static final Target WELCOME_HEADER = Target.the("Extract header of welcome page")
            .located(By.xpath("//ui-view/unauthenticated-container//ui-view/div/div/div/div[1]/div/h1"));
}
