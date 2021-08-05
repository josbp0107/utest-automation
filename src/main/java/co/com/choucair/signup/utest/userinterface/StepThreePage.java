package co.com.choucair.signup.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepThreePage {
    public static final Target BRAND_FIELD = Target.the("Target on brand field")
            .located(By.name("handsetMakerId"));
    public static final Target SELECT_BRAND = Target.the("Focus on brand field")
            .located(By.xpath("//section//ul/li/div[5]"));
    public static final Target MODEL_FIELD = Target.the("Target on Model field")
            .located(By.name("handsetModelId"));
    public static final Target SELECT_MODEL = Target.the("Focus on Model field")
            .located(By.xpath("//section//ul/li/div[7]"));
    public static final Target OS_FIELD = Target.the("Target on Os field")
            .located(By.name("handsetOSId"));
    public static final Target SELECT_OS = Target.the("Focus on Os field")
            .located(By.xpath("//section//ul/li/div[3]"));
    public static final Target LAST_STEP_BUTTON = Target.the("Click on Next: Last Step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
