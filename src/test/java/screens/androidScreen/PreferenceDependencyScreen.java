package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class PreferenceDependencyScreen {
    public PreferenceDependencyScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);

    }
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@checkable='true']")
    public MobileElement checkBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'WiFi settings')]")
    public MobileElement wifiSettingsButton;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement wifiSettingsEditText;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'TAMAM')]")
    public MobileElement tamamButtonOnWifiSettingsBox;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'İPTAL')]")
    public MobileElement iptalButtonOnWifiSettingsBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Preference/3. Preference dependencies')]")
    public MobileElement pre3PreDepTitle;

}
