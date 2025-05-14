package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoWebsiteAddToCartScenario {
    WebDriver driver;
    By userName_txtField= By.id("user-name");
    By password_txtField= By.id("password");
    By login_btn= By.id("login-button");
    By products= By.cssSelector(".inventory_item");
    int productSize;
    @Test
    public void Scenario(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        //Login Scenario
        driver.findElement(userName_txtField).sendKeys("standard_user");
        Assert.assertEquals(driver.findElement(userName_txtField).getAttribute("value"),"standard_user");
        driver.findElement(password_txtField).sendKeys("secret_sauce");
        Assert.assertEquals(driver.findElement(password_txtField).getAttribute("value"),"secret_sauce");
        driver.findElement(login_btn).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");

        //Loop of products then select specific one by passing it's name
         productSize = driver.findElements(products).size();
        System.out.println(productSize);
       Looping("Test.allTheThings() T-Shirt (Red)");
        //driver.quit();
    }


    public void Looping(String productName){
        for (int i=0;i<productSize;i++){
            By productsName= By.xpath("//div[@data-test='inventory-item-name']");
         if(driver.findElements(productsName).get(i).getText().equalsIgnoreCase(productName)){
             driver.findElements(By.cssSelector("div[class='pricebar'] button")).get(i).click();
             Assert.assertEquals(driver.findElements(By.cssSelector("div[class='pricebar'] button")).get(i).getText(),"Remove");

         }

        }
    }
}
