package Tests;

import Pages.AssertionMessages;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends TestBase{
   HomePage homePage;
   RegistrationPage registrationPage;
   AssertionMessages assertionMessages;
   LoginPage loginPage;


    @Test(priority = 1,alwaysRun = true)
    public void ValidRegistration(){
    homePage= new HomePage(driver);
     homePage.openRegistrationPage();
    registrationPage = new RegistrationPage(driver);
    registrationPage.Register("A","B","abcd88919@g.com","P@ssw0rd");
     assertionMessages = new AssertionMessages(driver);
     Assert.assertTrue(assertionMessages.Msg.getText().contains("Your registration completed"));
    }

    @Test(dependsOnMethods = {"ValidRegistration"})
    public void RegisterUserCanLogout(){
        registrationPage.setLog_out();
    }
    @Test(dependsOnMethods = {"RegisterUserCanLogout"})
    public void RegisteredUserCanLogin(){
        homePage= new HomePage(driver);
        homePage.UserLogin();
        loginPage= new LoginPage(driver);
        loginPage.User_Login("abcd88919@g.com","P@ssw0rd");

    }
}
