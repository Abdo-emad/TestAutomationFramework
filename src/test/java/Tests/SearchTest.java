package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    HomePage homePage;
    RegistrationPage registrationPage;
    LoginPage loginPage;
    SearchPage searchPage;

    @Test(priority = 1,alwaysRun = true)
    public void ValidRegistration(){
        homePage= new HomePage(driver);
        homePage.openRegistrationPage();
        registrationPage = new RegistrationPage(driver);
        registrationPage.Register("A","B","abc999@g.com","P@ssw0rd");
    }
    @Test(priority = 2)
    public void RegisteredUserCanLogin(){
        homePage= new HomePage(driver);
        homePage.UserLogin();
        loginPage= new LoginPage(driver);
        loginPage.User_Login("abc99@g.com","P@ssw0rd");
    }
    @Test(priority = 3)
    public void Search_Function(){
        searchPage = new SearchPage(driver);
        searchPage.Set_Search_Input();
        Assert.assertTrue(searchPage.device_Name.getText().contains("Apple MacBook Pro 13-inch"));
    }

}
