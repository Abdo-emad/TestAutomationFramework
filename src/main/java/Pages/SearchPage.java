package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    By search_Field = By.id("small-searchterms");
    WebElement Search_Input_Field= driver.findElement(search_Field);
    By search_Btn = By.cssSelector("button-1.search-box-button");
    WebElement Search_Button= driver.findElement(search_Btn);

    By dev_name = By.xpath("//div[@class=\"product-name\"]");
   public WebElement device_Name = driver.findElement(dev_name);

    public void Set_Search_Input(){
      SendValue(Search_Input_Field,"Mac");
      Click(Search_Button);
    }
}
