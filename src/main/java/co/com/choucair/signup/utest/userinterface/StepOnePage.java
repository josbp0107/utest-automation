package co.com.choucair.signup.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepOnePage {
    public static final Target FIRST_NAME = Target.the("Enter First name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Enter Last name")
            .located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("Enter Email address")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("Enter birth month")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("Enter birth Day")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Enter birth year")
            .located(By.id("birthYear"));
    public static final Target LANGUAGES = Target.the("Input the Languages")
            .located(By.xpath("//form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));
    public static final Target SELECT_LANGUAGE = Target.the("Select the language")
            .located(By.className("ui-select-highlight"));
    public static final Target NEXT_BUTTON = Target.the("Press the Button: next Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
