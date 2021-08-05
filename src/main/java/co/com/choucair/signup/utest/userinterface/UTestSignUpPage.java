package co.com.choucair.signup.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UTestSignUpPage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("Button that show us the form to register")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
