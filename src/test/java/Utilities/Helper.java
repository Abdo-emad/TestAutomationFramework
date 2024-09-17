package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper {

// New Way To Capture Screen shot
  /*  public static void CaptureScreenShot(WebDriver driver , String screenShotName) throws IOException {
        Path destination = Paths.get("/ScreenShot/"+screenShotName +".png");
        Files.createDirectory(destination.getParent());
        FileOutputStream fileOutputStream = new FileOutputStream(destination.toString());
        fileOutputStream.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
        fileOutputStream.close();
    }*/

    public static void TakeScreenShots(ITestResult result) throws IOException {

        WebDriver driver = new ChromeDriver();
        if (ITestResult.FAILURE == result.getStatus()){
            TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File(new File("./ScreenShot/") + result.getName() + ".png"));
        }

    }

}
