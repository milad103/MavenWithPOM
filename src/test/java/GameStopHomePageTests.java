
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class GameStopHomePageTests extends GameStopHomePage{



    @Test
    void HomePage_Logo_Clicking() {

        //driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[1]/div[2]/div/div/div/div/div/div/div/div/div/a[4]/div/div/picture/img")).click();
        driver.findElement(By.cssSelector("#globalSearchInputField")).click();
        driver.findElement(By.cssSelector("#globalSearchInputField")).sendKeys("acqua di gio");////*[@id="searchSubmit"]
        driver.findElement(By.xpath("//*[@id='searchSubmit']")).click();
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//*[@id='img_16469']")).click();
        driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector("[data-auto='add-to-bag']")).click();
   // driver.findElement(By.xpath("//*[@id='searchSubmit']")).click();////*[@id="img_16469"]
        /*TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File("./Screenshots/gamestop.png"));
*/

    }

}




