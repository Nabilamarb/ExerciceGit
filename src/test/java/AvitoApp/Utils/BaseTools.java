package AvitoApp.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static AvitoApp.Configuration.SetUpTearDown.driver;

public class BaseTools {
    private WebDriverWait wait;


    public void waitAndSendKeys(WebElement element, String text, int default_time){
        wait=new WebDriverWait(driver,default_time);
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }
    public WebElement waitElementToBeVisible(WebElement element,int default_time){
        wait=new WebDriverWait(driver,default_time);
        return wait.until(ExpectedConditions.visibilityOf(element));

    }

    public String waitAndGetTextFromInput(WebElement element,int default_time){
        return waitElementToBeVisible(element,default_time).getAttribute("value");
    }
    public String waitAndGetText(WebElement element,int default_time){
        return waitElementToBeVisible(element,default_time).getText();
    }
    public void waitAndClick(WebElement element,int default_time){
        wait=new WebDriverWait(driver,default_time);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
