package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class SwitchScreen {
    public SwitchScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public MobileElement checkBoxPreference;

    @AndroidFindBy(xpath = "(//android.widget.Switch)[1]")
    public MobileElement switchPreference1;

    @AndroidFindBy(xpath = "(//android.widget.Switch)[2]")
    public MobileElement switchPreference2;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'In-line preferences')]")
    public MobileElement inlinePreference;


}
