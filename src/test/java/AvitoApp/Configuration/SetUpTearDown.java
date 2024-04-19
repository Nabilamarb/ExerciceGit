package AvitoApp.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SetUpTearDown {
    public static WebDriver driver;

    @BeforeMethod
    public void lunchBrowser() {
        System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.avito.ma/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
