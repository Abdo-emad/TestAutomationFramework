package Tests;

import Pages.PageBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static Tests.TestBase.driver;

public class Scroll_Into_Element_in_selenium  {

    @Test()
            public void run1() throws IOException {
        WebDriver driver1= new ChromeDriver();
        driver1.get("https://google.com");
            //Scroll in the entire page
            JavascriptExecutor js = (JavascriptExecutor) driver1;
            js.executeScript("window.scrollBy(0,500)");

            //Scroll in specific element like using scroll bar in a table to scroll inside the table
            js.executeScript("document.querySelector('.class1').scrollTop=500");
            //Take screenshot and save it in your machine
            File src = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("C:\\Users\\aabdelghafar\\OneDrive - DXC Production\\Desktop\\screenshotSelenium.png"));
       driver1.quit();
        }
    }


