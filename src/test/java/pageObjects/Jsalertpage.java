package pageObjects;

import browersControl.WebConnector;

public class Jsalertpage extends WebConnector {

    /*************Locators*********/
    private String JSAlertButtonXpath="//button[@onclick='jsAlert()']";
    private String JSAConfirmButtonXpath="//button[@onclick='jsConfirm()']";
    private String JSAPromptButtonxpath="//button[@onclick='jsPrompt()']";


    /**********Getter and Setters***********/
    /**
     * METHOD TO CLICK ON JS ALERT BUTTON
     */
    public void setJSAlertButton( ){

        BasePage.findElementByXpath(10,JSAlertButtonXpath).click();
    }

    /**
     * Method to click on JS Confirm button
     */
    public void clickOnSAConfirmButton(){
        BasePage.findElementByXpath(10,JSAConfirmButtonXpath).click();
    }

    /**
     * Method to click on JS Prompt button
     */
    public void clickOnJSAPromptButton(){
        BasePage.findElementByXpath(10,JSAPromptButtonxpath).click();
    }




}
