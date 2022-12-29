package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import screens.Screens;
import utils.ReusableMethods;

public class iOS extends ReusableMethods {
    Screens screens=new Screens();
    @When("User cliks alert view")
    public void userCliksAlertView() {
        screens.alertViewScreen().alertViewButton.click();
    }

    @And("User clicks to okay button")
    public void userClicksToOkayButton() {
        screens.alertViewScreen().okButton.click();
    }

    @And("User on the popup screen")
    public void userOnThePopupScreen() {
        isElementPresent(screens.alertViewScreen().popupText);
    }

    @And("User clicks ok button")
    public void userClicksOkButton() {
        tapOn(screens.alertViewScreen().okCancelButton);
    }
}
