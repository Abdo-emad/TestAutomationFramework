package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class CheckBrokenLinks {

    @Test
    public void CheckSpecificLink() throws IOException {
        WebDriver driver1= new ChromeDriver();
        driver1.get("https://google.com");
            //get the status code of url to check it's broken url or not
         String url = driver1.findElement(By.cssSelector("h1[href*='brokerLink']")).getAttribute("href");
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int responseCode = connection.getResponseCode();
        System.out.println(responseCode);
        Assert.assertEquals(responseCode, 404);
         driver1.quit();
        }


    @Test
    public void CheckAllBrokenLinksInThePage() throws IOException {
        WebDriver driver1= new ChromeDriver();
        driver1.get("https://google.com");
        //get the status code of all url's to check it's broken url or not
        List<WebElement> links = driver1.findElements(By.cssSelector("li[class='gf-li'] a"));
        for (WebElement link : links){
            String url = link.getAttribute("href");
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int responseCode = connection.getResponseCode();
        System.out.println(responseCode);
        if (responseCode>400) Assert.fail();
        driver1.quit();
    }
    }}


