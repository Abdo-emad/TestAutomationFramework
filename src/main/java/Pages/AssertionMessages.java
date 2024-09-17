package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssertionMessages extends PageBase{
    public AssertionMessages(WebDriver driver) {
        super(driver);
    }
    By success_Msg = By.xpath("//div[@class=\"result\"]");
    public WebElement Msg = driver.findElement(success_Msg);

   /* By password_change_msg = By.xpath("class=\"content\"");
   public WebElement ChangePassSuccessMessage= driver.findElement(password_change_msg);
*/
}
