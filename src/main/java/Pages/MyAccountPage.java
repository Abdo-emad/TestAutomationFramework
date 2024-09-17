package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MyAccountPage extends PageBase{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }


    public void ChangePasswordButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        By changePass_link = By.partialLinkText("Change password");
        WebElement Change_Pass_link = driver.findElement(changePass_link);
       Click(Change_Pass_link);
    }
    public void Set_Change_Password(String old_Pass , String newPass){
        By oldPass = By.id("OldPassword");
        WebElement Old_Pass = driver.findElement(oldPass);
        By new_Pass = By.id("NewPassword");
        WebElement New_Pass = driver.findElement(new_Pass);
        By confirmPass = By.id("ConfirmNewPassword");
        WebElement Confirm_Pass = driver.findElement(confirmPass);
        SendValue(Old_Pass,old_Pass);
        SendValue(New_Pass,newPass);
        SendValue(Confirm_Pass,newPass);
        By changePass_btn = By.xpath("//div[@class=\"buttons\"]//button[@type=\"submit\"]");
        WebElement change_pass_button = driver.findElement(changePass_btn);
        Click(change_pass_button);

    }



}
