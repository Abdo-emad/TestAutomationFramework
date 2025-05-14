package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTablePracticeTipsAndTricksTest {
    WebDriver driver ;
    By TableElementCheckBox(String CountryName){
        return By.xpath("//td[.='"+CountryName+"']//parent::tr/td/input[@type='checkbox']");
    }
    @BeforeClass
    public void Setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
    }



    @Test
    public void ClickOnCheckBox(){
        driver.findElement(TableElementCheckBox("Argentina")).click();
    }

}
