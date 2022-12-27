package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;

public class ApiDemosSteps extends ReusableMethods {
//MainScreen mainScreen = new MainScreen();
//ApiDemosScreen apiDemosScreen = new ApiDemosScreen();
//PreferenceScreen preferenceScreen = new PreferenceScreen();
//PreferenceDependencyScreen preferenceDependencyScreen = new PreferenceDependencyScreen();

    //Asagidaki Screens i kullandigimiz icin yukardakileri de onun icinden cagirdigimiz icin
    //artik yukaridaki ayri ayri step definitions lara gerek kalmadi--> Importlar da dahil
    //bu sekilde mesela  -- apiDemosScreen.apiDemosTitle -- olarak daha onceden yadigimiz methodu
    //               -- screens.apiDemosScreen().apiDemosTitle -- olarak kullaniyorum
    Screens screens = new Screens();
    ScreenshotStepDefs screenshotStepDefs;

    @Given("App loaded")
    public void app_loaded() {
        Driver.getAppiumDriver();
    }


    @Then("User on the API Demos monitor")
    public void user_on_the_api_demos_monitor() {
        Assert.assertTrue(screens.apiDemosScreen().isElementDisplayed(screens.apiDemosScreen().apiDemosTitle));
        // Assert.assertTrue(apiDemosScreen.isElementDisplayed(apiDemosScreen.apiDemosTitle));
    }

    @Given("User on the main page")
    public void user_on_the_main_page() {
        Assert.assertTrue(screens.apiDemosScreen().isElementDisplayed(screens.mainScreen().apiDemosTitle));
        // Assert.assertTrue(apiDemosScreen.isElementDisplayed(mainScreen.apiDemosTitle));
    }


    @Given("User clicks to API Demos Button")
    public void user_clicks_to_api_demos_button() {
        screens.mainScreen().apiDemosButton.click();
        //mainScreen.apiDemosButton.click();
    }

    @Then("User clicks preference button")
    public void user_clicks_preference_button() {
        screens.apiDemosScreen().preferenceButton.click();
        // apiDemosScreen.preferenceButton.click();
    }

    @Then("User on the Preference monitor")
    public void user_on_the_preference_monitor() {
        // Assert.assertTrue(preferenceScreen.preferenceDependencyButton.isDisplayed());
        Assert.assertTrue(screens.apiDemosScreen().isElementDisplayed(screens.preferenceScreen().preferenceDependencyButton));

    }

    @Then("User clicks Preference Dependencies button")
    public void user_clicks_preference_dependencies_button() {
        screens.preferenceScreen().preferenceDependencyButton.click();
        // preferenceScreen.preferenceDependencyButton.click();
    }

    @Then("Check box must be choosed")
    public void check_box_must_be_choosed() {
        if (!screens.preferenceDependencyScreen().checkBox.getAttribute("checked").equals("true")) {
            screens.preferenceDependencyScreen().checkBox.click();
        }
    }

    @Then("User clicks WIFI Settings")
    public void user_clicks_wifi_settings() {
        screens.preferenceDependencyScreen().wifiSettingsButton.click();
    }

    @Then("User sees to WIFI Settings popup")
    public void user_sees_to_wifi_settings_popup() {
        Assert.assertTrue(screens.apiDemosScreen().isElementDisplayed(screens.preferenceDependencyScreen().wifiSettingsEditText));

    }

    @Then("User sends text")
    public void user_sends_text() {
        screens.preferenceDependencyScreen().wifiSettingsEditText.sendKeys("Who you are?");
    }

    @Then("User clicks to OK button")
    public void user_clicks_to_ok_button() {
        screens.preferenceDependencyScreen().tamamButtonOnWifiSettingsBox.click();
        Assert.assertTrue(screens.apiDemosScreen().isElementDisplayed(screens.preferenceDependencyScreen().wifiSettingsButton));

    }

    @When("User clicks to switches button")
    public void user_clicks_to_switches_button() {
        screens.preferenceScreen().switchesButton.click();
    }


    @When("User clicks check box")
    public void user_clicks_check_box() {
            screens.switchScreen().checkBoxPreference.click();
    }

    @When("User cliks switch button")
    public void user_cliks_switch_button() {
        screens.switchScreen().switchPreference1.click();
    }


    @Then("User on the {string} monitor")
    public void user_on_the_monitor(String string) {
        Assert.assertTrue(isElementPresent(string));

    }

    @When("User clicks to {string} button")
    public void user_clicks_to_button(String string) {
        tapOnElementWithText(string);
    }
    @When("User take a screenShoot")
    public void user_take_a_screen_shoot() {
        try {
            screenshotStepDefs.screenshot_al();
        } catch (IOException e) {
            System.out.println("ScreenShoot can't be took");;
        }
    }
    @Then("User sends {string}")
    public void user_sends(String string) {
        enterText(screens.preferenceDependencyScreen().wifiSettingsEditText,string);
    }
    @Then("User close to app")
    public void user_close_to_app() {
       Driver.getAppiumDriver().closeApp();
    }
    @When("check box secili olmali")
    public void check_box_secili_olmali() {
        if (screens.switchScreen().checkBoxPreference.getAttribute("checked").equals("false")){
            tapOn(screens.switchScreen().checkBoxPreference);
        }
    }


    @When("ilk switch butonu kapali")
    public void ilk_switch_butonu_kapali() {
     if (screens.switchScreen().switchPreference1.getAttribute("checked").equals("true")){
          tapOn(screens.switchScreen().switchPreference1);
        }
    }
    @When("ikici switch butonu acik")
    public void ikici_switch_butonu_acik() {
        if(screens.switchScreen().switchPreference2.getAttribute("checked").equals("false")){
            tapOn(screens.switchScreen().switchPreference2);
        }
    }


}
