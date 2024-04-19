package AvitoApp.Pages;

import AvitoApp.Utils.BaseTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAvito extends BaseTools {
    WebDriver driver;
    @FindBy(xpath = "//span[text()='Se connecter']")
    WebElement SeConnecterBoutton ;

    public PageAvito(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void SeConnecter(){
        waitAndClick(SeConnecterBoutton,30);
    }
}
