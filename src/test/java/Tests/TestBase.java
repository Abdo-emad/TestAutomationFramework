package Tests;

import Utilities.Helper;
import Utilities.Helper1;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TestBase {

   public WebDriver driver;
    @BeforeSuite
   @Parameters({"browser"})
    public void SetUp(@Optional("chrome") String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            driver= new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();
        }else {
            driver= new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source,new File("./ScreenShots/"+result.getName()+".png"));
        }
    }
    // New Way To capture Screen Shot
/*    @AfterMethod
    public static void ScreenShotCapture(ITestResult result){
if (ITestResult.FAILURE == result.getStatus()){
    System.out.println("Failure");
    Helper.CaptureScreenShot(driver,result.getName());
}
    }*/



    @AfterSuite
    public void CloseBrowser(){
        driver.quit();
    }

}
