package Tests;

import Pages.AssertionMessages;
import Pages.HomePage;
import Pages.RegistrationPageUsingDataProvider;
import com.github.javafaker.Faker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RegistrationTestUsingDataProviderUsingDataFakerLibrary extends TestBase{
   HomePage homePage;
   RegistrationPageUsingDataProvider registrationPageUsingDataProvider;
   AssertionMessages assertionMessages;
   Faker DataFaker = new Faker();



    @Test(priority = 1,alwaysRun = true )
    public void UserCanRegister() {
        int i =0;
        for (i = 0; i < 10; i++) {
            String firstName = DataFaker.name().firstName();
            String lastName = DataFaker.name().lastName();
            String email = DataFaker.internet().emailAddress();
            String password = DataFaker.number().digits(8);
            homePage = new HomePage(driver);
            homePage.openRegistrationPage();
            registrationPageUsingDataProvider = new RegistrationPageUsingDataProvider(driver);
            registrationPageUsingDataProvider.Registration_Fun(firstName, lastName, email, password);
            System.out.println("User Registration Data :" + firstName + " " + lastName + " " + email + " " + password);
            assertionMessages = new AssertionMessages(driver);
            Assert.assertTrue(assertionMessages.Msg.getText().contains("Your registration completed"));
            driver.findElement(By.partialLinkText("Log")).click();
        }
    }

}


