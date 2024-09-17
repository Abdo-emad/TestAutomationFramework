package Tests;

import Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyAccountTest extends TestBase{
    HomePage homePage;
    RegistrationPage registrationPage;
    MyAccountPage myAccountPage;
    LoginPage loginPage;
    AssertionMessages assertionMessages;

    @Test(priority = 1,alwaysRun = true)
    public void ValidRegistration(){
        homePage= new HomePage(driver);
        homePage.openRegistrationPage();
        registrationPage = new RegistrationPage(driver);
        registrationPage.Register("A","B","abcd88917798@g.com","P@ssw0rd");
        }



    @Test(priority = 2,dependsOnMethods = {"ValidRegistration"})
    public void Set_Change_Password() {
      registrationPage.My_Account();
        myAccountPage = new MyAccountPage(driver);
        myAccountPage.ChangePasswordButton();
        myAccountPage.Set_Change_Password("P@ssw0rd", "P@ssw0rd123");
        driver.findElement(By.xpath("//span[@class=\"close\"]")).click();
    }
    @Test(dependsOnMethods = {"Set_Change_Password"})
    public void RegisterUserCanLogout(){
        registrationPage.setLog_out();
    }
    @Test(dependsOnMethods = {"RegisterUserCanLogout"})
    public void RegisteredUserCanLogin(){
        homePage= new HomePage(driver);
        homePage.UserLogin();
        loginPage= new LoginPage(driver);
        loginPage.User_Login("abcd88919@g.com","P@ssw0rd123");

    }

}
