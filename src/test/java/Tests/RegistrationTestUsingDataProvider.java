package Tests;

import Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class RegistrationTestUsingDataProvider extends TestBase{
   HomePage homePage;
   RegistrationPageUsingDataProvider registrationPageUsingDataProvider;
   AssertionMessages assertionMessages;


@DataProvider(name = "DataDrivenTest")
public static Object[][] RegistrationData(){
    return new Object[][]{
            {"Ab" , "D" , "adr7123@gmail.com" , "P@ssw0rd"},
            {"Bc" , "D" , "bd88123@gmail.com" , "P@ssw0rd"}

    };
}


    @Test(priority = 1,alwaysRun = true , dataProvider = "DataDrivenTest")
    public void UserCanRegister(String f_name , String L_name , String email , String pass){
    homePage= new HomePage(driver);
     homePage.openRegistrationPage();
    registrationPageUsingDataProvider = new RegistrationPageUsingDataProvider(driver);
    registrationPageUsingDataProvider.Registration_Fun(f_name,L_name,email,pass);
     assertionMessages = new AssertionMessages(driver);
     Assert.assertTrue(assertionMessages.Msg.getText().contains("Your registration completed"));
        driver.findElement(By.partialLinkText("Log")).click();
}

 }

