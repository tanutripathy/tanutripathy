package pageObjects;

import browersControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends WebConnector {
    /**
     * Method to find and return the element using given xpath
     * @param time-duration in seconds
     * @param xpath-Xpath of the elements
     * @return
     */
    public static WebElement findElementByXpath(int time,String xpath){
        return new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
}
