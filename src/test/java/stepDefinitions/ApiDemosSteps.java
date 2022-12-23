package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import screens.Screens;
import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.MainScreen;
import screens.androidScreen.PreferenceDependencyScreen;
import screens.androidScreen.PreferenceScreen;
import utils.Driver;

public class ApiDemosSteps {
//MainScreen mainScreen = new MainScreen();
//ApiDemosScreen apiDemosScreen = new ApiDemosScreen();
//PreferenceScreen preferenceScreen = new PreferenceScreen();
//PreferenceDependencyScreen preferenceDependencyScreen = new PreferenceDependencyScreen();

    //Asagidaki Screens i kullandigimiz icin yukardakileri de onun icinden cagirdigimiz icin
    //artik yukaridaki ayri ayri step definitions lara gerek kalmadi--> Importlar da dahil
    //bu sekilde mesela  -- apiDemosScreen.apiDemosTitle -- olarak daha onceden yadigimiz methodu
    //               -- screens.apiDemosScreen().apiDemosTitle -- olarak kullaniyorum
    Screens screens= new Screens();

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

}
