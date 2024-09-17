package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    By btn_login = By.xpath("//div[@class=\"buttons\"]//button[@type=\"submit\"]");
    WebElement log_button = driver.findElement(btn_login);
    public void User_Login(String email, String password){
        By mail= By.id("Email");
        WebElement EMail= driver.findElement(mail);
        SendValue(EMail,email);
        By pass= By.id("Password");
        WebElement Password= driver.findElement(pass);
        SendValue(Password,password);
        Click(log_button);

    }
}
