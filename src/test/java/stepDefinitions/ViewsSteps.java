package stepDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.*;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class ViewsSteps extends ReusableMethods {
    TouchAction action = new TouchAction(Driver.getAppiumDriver());
    Screens screens = new Screens();

    @When("User drags first ball drops to second ball")
    public void user_drags_first_ball_drops_to_second_ball() {

        action.
                longPress(ElementOption.element(screens.dragDropScreens().firstDot)).
                moveTo(ElementOption.element(screens.dragDropScreens().secontDot)).
                release().perform();
        //birinci topu al longPress(uzunnbasılıtut) sonra ikinci topun uzerine gotur
        //moveto(hareket ettir basılı tuttugunu surukle dıger topun uzerıne )
        //ikinci topun uzerıne gıdınce release ile serbest bıraktık
        //action oldugu icin sonuna perform koyduk
    }

    @Then("User sees the fourth ball")
    public void user_sees_the_fourth_ball() {
        Assert.assertTrue(isElementPresent(screens.dragDropScreens().fourthDot));
    }

    @Given("User clicks {int}  button")
    public void user_clicks_button(Integer int1) {

        tapOn((MobileElement) Driver.getAppiumDriver().findElementByAccessibilityId(String.valueOf(int1)));
    }


    @Given("User swipe green dot from {int} yo {int} button")
    public void user_swipe_green_dot_from_yo_button(Integer int1, Integer int2) {

action.press( ElementOption.element(Driver.getAppiumDriver().findElementByAccessibilityId(String.valueOf(int1))))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo( ElementOption.element(Driver.getAppiumDriver().findElementByAccessibilityId(String.valueOf(int2))))
        .release().perform();

        for (int i = int1; i <=int2 ; i+=5) {

            action.press( ElementOption.element(Driver.getAppiumDriver().findElementByAccessibilityId(String.valueOf(i))))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).release().perform();
        }

//prees() islemi ile 15'in uzerinde basılı halde beklettik
//Sonra 2 saniye beklettik
//moveTo() ile 45'in uzerine surukleyerek cektik ve realese() ile serbest bıraktık
    }

}
