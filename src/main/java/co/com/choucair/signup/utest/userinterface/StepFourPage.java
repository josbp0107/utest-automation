package co.com.choucair.signup.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepFourPage {
    public static final Target PASSWORD = Target.the("Enter the Password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Enter the confirm password")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("Check Term of Use")
            .located(By.name("newsletterOptIn"));
    public static final Target TERM_USE = Target.the("Check Term of Use")
            .located(By.id("termOfUse"));
    public static final Target PRIVACITY_SETTING = Target.the("Check  Privacity Setting")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_BUTTON = Target.the("Click to complete Setup")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
