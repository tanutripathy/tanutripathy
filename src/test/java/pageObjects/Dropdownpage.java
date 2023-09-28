package pageObjects;

import browersControl.WebConnector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpage  extends WebConnector {

    /**************************Locators*******/

private String dropdownXpath="//select[@id='dropdown']";
private String dropdownselectedoptionXpath="//select[@id='dropdown']//option[@selected='selected']";


    /***********Getters and Setters**********/
    /**
     * method to select the given option from the dropdown
     * @param SelectOption
     */

    public void setDropdown(String SelectOption){
        BasePage.findElementByXpath(10,dropdownXpath).sendKeys(SelectOption);
    }
    public String getDropdownselectedoption(){
       return BasePage.findElementByXpath(10,dropdownselectedoptionXpath).getText();

}
public void Selectoptionfromdropdown(String option){

        WebElement dropdown =BasePage.findElementByXpath(10,dropdownXpath);
        Select select=new Select(dropdown);
select.selectByVisibleText(option);


}
}