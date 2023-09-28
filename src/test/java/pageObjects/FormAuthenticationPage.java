package pageObjects;

import browersControl.WebConnector;


public class FormAuthenticationPage extends WebConnector {

    /****************Locators***************/
    private String usernameFieldXpath="//input[@id='username']";
    private String passwordFieldXpath="//input[@id='password']";
    private String loginButtonxpath="//button[@type='submit']";


    /****************Getter and Setters*****************/

    /**
     * set username
     * @param username
     */

    public void setUsername(String username){
        BasePage.findElementByXpath(10,usernameFieldXpath).sendKeys(username);
    }

    /**
     * set password field
     * @param password
     */
    public void setPassword(String password) {
        BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);
    }
        /**
         * click on login button
         */

    public void clickLogin(){
      BasePage.findElementByXpath(10,loginButtonxpath).click();
    }

}
