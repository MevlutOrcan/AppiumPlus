package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.MainScreen;
import screens.androidScreen.PreferenceDependencyScreen;
import screens.androidScreen.PreferenceScreen;
import utils.Driver;

public class ApiDemosSteps {
    MainScreen mainScreen = new MainScreen();
    ApiDemosScreen apiDemosScreen = new ApiDemosScreen();
    PreferenceScreen preferenceScreen = new PreferenceScreen();
    PreferenceDependencyScreen preferenceDependencyScreen = new PreferenceDependencyScreen();

    @Given("App loaded")
    public void app_loaded() {
        Driver.getAppiumDriver();
    }


    @Then("User on the API Demos monitor")
    public void user_on_the_api_demos_monitor() {
        Assert.assertTrue(apiDemosScreen.isElementDisplayed(apiDemosScreen.apiDemosTitle));
    }

    @Given("User on the main page")
    public void user_on_the_main_page() {
        Assert.assertTrue(apiDemosScreen.isElementDisplayed(mainScreen.apiDemosTitle));
    }


    @Given("User clicks to API Demos Button")
    public void user_clicks_to_api_demos_button() {
        mainScreen.apiDemosButton.click();
    }

    @Then("User clicks preference button")
    public void user_clicks_preference_button() {
        apiDemosScreen.preferenceButton.click();
    }

    @Then("User on the Preference monitor")
    public void user_on_the_preference_monitor() {
        // Assert.assertTrue(preferenceScreen.preferenceDependencyButton.isDisplayed());
        Assert.assertTrue(apiDemosScreen.isElementDisplayed(preferenceScreen.preferenceDependencyButton));
    }

    @Then("User clicks Preference Dependencies button")
    public void user_clicks_preference_dependencies_button() {
        preferenceScreen.preferenceDependencyButton.click();
    }

    @Then("Check box must be choosed")
    public void check_box_must_be_choosed() {
        if (!preferenceDependencyScreen.checkBox.getAttribute("checked").equals("true")) {
            preferenceDependencyScreen.checkBox.click();
        }
    }

    @Then("User clicks WIFI Settings")
    public void user_clicks_wifi_settings() {
        preferenceDependencyScreen.wifiSettingsButton.click();
    }

    @Then("User sees to WIFI Settings popup")
    public void user_sees_to_wifi_settings_popup() {
        Assert.assertTrue(apiDemosScreen.isElementDisplayed(preferenceDependencyScreen.wifiSettingsEditText));

    }

    @Then("User sends text")
    public void user_sends_text() {
        preferenceDependencyScreen.wifiSettingsEditText.sendKeys("Who you are?");
    }

    @Then("User clicks to OK button")
    public void user_clicks_to_ok_button() {
        preferenceDependencyScreen.tamamButtonOnWifiSettingsBox.click();
        Assert.assertTrue(apiDemosScreen.isElementDisplayed(preferenceDependencyScreen.wifiSettingsButton));

    }

}
