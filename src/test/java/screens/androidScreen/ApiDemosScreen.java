package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class ApiDemosScreen {
    public ApiDemosScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public MobileElement apiDemosTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Preference')]")
    public MobileElement preferenceButton;

    public boolean isElementDisplayed(MobileElement x) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x.isDisplayed();
    }




}

