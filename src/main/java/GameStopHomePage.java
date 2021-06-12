import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class GameStopHomePage {

    WebDriver driver;
    //@FindBy( css = "img[src='//media.gamestop.com/i/gamestop/Nav_Ps4_2.jpeg']")



   // @FindBy( css = "img[src='//media.gamestop.com/i/gamestop/Nav_Ps4_2.jpeg']")
    //WebElement LogoHomePage;
    //clicking the main logo on top left of the HP which will redirect us to the HomePage


    @BeforeMethod
    void setup() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://macys.com");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    void closingBrowser() throws InterruptedException {

        Thread.sleep(100000);
        driver.quit();
    }
}