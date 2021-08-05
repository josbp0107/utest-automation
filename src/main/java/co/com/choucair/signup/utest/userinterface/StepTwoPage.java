package co.com.choucair.signup.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class StepTwoPage {

    public static final Target CITY = Target.the("Enter the City location")
            .located(By.id("city"));
    public static final Target LIST_CITY = Target.the("Select the list of Cities")
            .located(By.xpath("//div[@class='pac-container pac-logo']/div[1]"));
    public static final Target ZIP_CODE = Target.the("Enter the Zip or Postal Code")
            .located(By.id("zip"));
//    public static final Target COUNTRY = Target.the("Select the Country")
//            .located(By.className("btn btn-default form-control ui-select-toggle"));
    public static final Target DEVICE_BUTTON = Target.the("Click on Next: Decives button")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
