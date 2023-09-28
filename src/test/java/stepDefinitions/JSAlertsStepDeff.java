package stepDefinitions;

import browersControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;
import pageObjects.Jsalertpage;


import java.time.Duration;

public class JSAlertsStepDeff extends WebConnector {

    Jsalertpage alertpage = new Jsalertpage();


    @When("the user click on JS Alert button")
    public void the_user_click_on_js_alert_button() {
        alertpage.setJSAlertButton();
    }


    @Then("the user should see {string} text on JS Alert page")
    public void theUserShouldSeeTextOnJSAlertPage(String expectedText) {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("the user should see {string} text on the JS Alert page")
    public void theUserShouldSeeTextOnTheJSAlertPage(String expectedText) {
        Alert alert;
        alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();

    }

    @When("the user click on JS Confirm button")
    public void the_user_click_on_js_confirm_button() {
        alertpage.clickOnSAConfirmButton();
    }


    @Then("the user should see {string} text on JS Confirm page")
    public void theUserShouldSeeTextOnJSConfirmPage(String expectedText) {
        Alert alert=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualText= alert.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @And("the user should see {string} text on the JS Confirm page")
    public void theUserShouldSeeTextOnTheJSConfirmPage(String expectedText) {
        Alert alert=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
    @And("if the user click on cancel button")
    public void ifTheUserClickOnCancelButton() {
        Alert alert=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }


    @When("the user click on JS Prompt button")
    public void theUserClickOnJSPromptButton() {
        alertpage.clickOnJSAPromptButton();
    }

    @Then("the user should see {string} text on JS Prompt page")
    public void theUserShouldSeeTextOnJSPromptPage(String expectedText) {
        Alert alert=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualText= alert.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @Then("the user should enter {string} on the JS Alert page")
    public void theUserShouldEnterOnTheJSAlertPage(String name ) {
        Alert alert = new  WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(name);

    }

    @And("the user should see {string} text on the JS Prompt page")
    public void theUserShouldSeeTextOnTheJSPromptPage(String expectedText) {
        Alert alert=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();

    }



}








