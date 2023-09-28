package stepDefinitions;

import browersControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.Dropdownpage;

public class DropdownStepDefinition extends WebConnector {

    private Dropdownpage dropdown =new Dropdownpage();

    @When("the user select {string}option from the dropdown list")
    public void theUserSelectOptionFromTheDropdownList(String SelectOption) {
        dropdown.Selectoptionfromdropdown(SelectOption);
    }


    @Then("the user should see {string}option is selected in the dropdown list")
    public void theUserShouldSeeOptionIsSelectedInTheDropdownList(String SelectOption) {
        String actualtext=dropdown.getDropdownselectedoption();
        Assert.assertEquals(SelectOption,actualtext);
    }

}

