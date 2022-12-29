package screens.iosScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class PickerViewScreen {
    public PickerViewScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @iOSXCUITFindBy(accessibility = "Red color component value")
    public MobileElement firstColumn;

    @iOSXCUITFindBy(accessibility = "Green color component value")
    public MobileElement secondColumn;

    @iOSXCUITFindBy(accessibility = "Blue color component value")
    public MobileElement thirdColumn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Picker View\"]")
    public MobileElement pickerViewTitle;}
