package AvitoApp.Pages;

import AvitoApp.Utils.BaseTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class PageLogin extends BaseTools {
    @FindBy(xpath = "//a[text()=\"S'inscrire gratuitement.\"]")
    private WebElement boutonInscrire;

    WebDriver driver;

    public PageLogin(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void InscrireGratuitement(){
        waitAndClick(boutonInscrire,30);

    }



}
