package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;
import java.util.List;

import static utils.ReusableMethods.*;

public class ViewsScreen {

  public   ViewsScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Switches')]")
    public List<MobileElement> switchesButton;

}
