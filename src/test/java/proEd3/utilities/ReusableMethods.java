package proEd3.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ReusableMethods {

    protected static WebDriver driver;

    public static String getScreenShot(String imageName) throws IOException {

        // name it with the current date to differentiate
        String currentDate = (new SimpleDateFormat("yyyyMMddhhmmss")).format(new Date());

        //Use TakeScreenshot interface of Selenium
        TakesScreenshot ts=(TakesScreenshot) Driver.getDriver();

        //filetype named source is linked with TakeScreenShot obj. . At this stage the binary is onboard.
        File source=ts.getScreenshotAs(OutputType.FILE);

        //full path to the screenShot location and linkage to the fileObj.
        String targetPath=System.getProperty("user.dir")+ "/test-output/Screenshoots/" +imageName + currentDate +".png";
        File finalDestination= new File(targetPath);

        //placement of the binary into the file
        FileUtils.copyFile(source,finalDestination);

        return targetPath;
    }


    //=============Explict Wait======
        public static WebElement waitForVisibility(WebElement element, int timeout){
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void takeScreenShot() throws IOException {

        File image = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDate = (new SimpleDateFormat("yyyyMMddhhmmss")).format(new Date());
        String var10000 = System.getProperty("user.dir");
        String path = var10000 + "/test-output/Screenshots/" + currentDate + "-image.png";
        File finalPath = new File(path);
        FileUtils.copyFile(image, finalPath);
    }

}
