package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PageBase {
    protected WebDriver driver;
   public JavascriptExecutor javascriptExecutor; //Used to Scroll
   public Actions actions; //Used to hover on element then select element
    public PageBase(WebDriver driver){
        this.driver= driver;

    }
    public void SendValue(WebElement element, String value){
        element.sendKeys(value);
    }
    public void Click(WebElement button){
        button.click();

    }

    //Scroll to the bottom of page >> if u want to use it in any test case , just call the method
    public  void scrollDown(){
        javascriptExecutor.executeScript("scrollBy(0,2500)");
    }



}
