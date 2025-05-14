package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class TakeScreenShotForSpecificElement {

    @Test
    public void ScreenShot() throws IOException {
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameField =driver1.findElement(By.cssSelector("[name=\"name\"]"));
        nameField.sendKeys("Test");
        // Take Screenshot for Specific element
        File file = nameField.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("NameFieldPic.png"));
        //Get Height and width of element
        System.out.println(nameField.getRect().getDimension().getHeight());
        System.out.println(nameField.getRect().getDimension().getWidth());
        driver1.quit();
    }

    }


