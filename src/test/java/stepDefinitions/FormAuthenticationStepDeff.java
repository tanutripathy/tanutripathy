package stepDefinitions;

import browersControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FormAuthenticationPage;
import utilities.ConstantUtils;

import java.time.Duration;

public class FormAuthenticationStepDeff extends WebConnector {

    FormAuthenticationPage form=new FormAuthenticationPage();


    @Given("the user navigate to the home page")
    public void theUserNavigateToTheHomePage() {
        driver.get(ConstantUtils.BASE_URL);
    }
    @Given("the user follows {string} link")
    public void the_user_follows_link(String linkText) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText(linkText))).click();
    }

    @When("the user enter {string} in user name field")
    public void the_user_enter_in_user_name_field(String username) {
        form.setUsername(username);
    }

    @When("the user enter {string} in password field")
    public void the_user_enter_in_password_field(String password) {
        form.setPassword(password);
    }

    @When("the user click on login button")
    public void the_user_click_on_login_button() {
        form.clickLogin();
    }

    @Then("the user should see {string} text on the page")
    public void theUserShouldSeeTextOnThePage(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }


    @When("the user enter {string} in user name field and enter the {string} in password field and  click on the login button")
    public void theUserEnterInUserNameFieldAndEnterTheInPasswordFieldAndClickOnTheLoginButton(String username, String password) {
        form.setUsername(username);
        form.setPassword(password);
        form.clickLogin();
    }

}
