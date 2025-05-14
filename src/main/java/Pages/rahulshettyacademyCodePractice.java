package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.List;

public class rahulshettyacademyCodePractice {
    public static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("userEmail")).sendKeys("zidanabdoo54@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("P@ssw0rd");
        driver.findElement(By.id("login")).click();
        //  Thread.sleep(10000);
        List<WebElement> productsCard = driver.findElements(By.cssSelector(".mb-3"));
        for (int i=0;i< productsCard.size();i++){
        String productName=driver.findElements(By.cssSelector("h5 b")).get(i).getText();
     if (productName.equalsIgnoreCase("LG Refrigerator")){
         new Actions(driver).moveToElement(driver.findElements(By.cssSelector(".w-10")).get(i)).build().perform();
         driver.findElements(By.cssSelector(".w-10")).get(i).click();
         break;
     }
        }

       // driver.quit();
    }
}
