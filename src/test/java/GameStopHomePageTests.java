
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
    void HomePage_Logo_Clicking() throws IOException {

        //driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[1]/div[2]/div/div/div/div/div/div/div/div/div/a[4]/div/div/picture/img")).click();
    driver.findElement(By.xpath("//*[@id=\"sg-navbar-collapse\"]/div/div/nav/div[4]/div[1]/ul/li[7]/a/span")).click();


        /*TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File("./Screenshots/gamestop.png"));
*/
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));
    }
    @Test
    void ps4() throws IOException {
        driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[1]/div[2]/div/div/div/div/div/div/div/div/div/a[4]/div/div/picture/img")).click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));
    }

}




