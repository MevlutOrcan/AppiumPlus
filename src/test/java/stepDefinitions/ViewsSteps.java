package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.*;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

public class ViewsSteps extends ReusableMethods {
    Screens screens = new Screens();

    @When("User drags first ball drops to second ball")
    public void user_drags_first_ball_drops_to_second_ball() {
        TouchAction action = new TouchAction(Driver.getAppiumDriver());
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

}
