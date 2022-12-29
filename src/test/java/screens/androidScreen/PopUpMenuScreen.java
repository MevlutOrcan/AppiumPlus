package screens.androidScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class PopUpMenuScreen {
    public PopUpMenuScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
    }

    @AndroidFindBy(className = "android.widget.Button")
    public List<MobileElement> buttons;

    @AndroidFindBy(xpath = "//android.widget.Toast[contains(@text,'Clicked')]")
    public MobileElement popUpMessage;
    //Eger popup test edılmek ıstenıyorsa ve bu search kod ıcınde bulunmuyorsa
//developerlar genelde bunu asagıdaki gibi className= "android.widget.Toast" ile build ederler bizde bu sekilde verify ederiz


}
