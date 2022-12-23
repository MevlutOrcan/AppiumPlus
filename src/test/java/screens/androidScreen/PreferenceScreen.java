package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class PreferenceScreen {
    public PreferenceScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);

    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'3. Preference')]")
    public MobileElement preferenceDependencyButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'9. Switch')]")
    public MobileElement switchButton;

}
