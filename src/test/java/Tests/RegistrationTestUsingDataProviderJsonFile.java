package Tests;

import Pages.AssertionMessages;
import Pages.HomePage;
import Pages.RegistrationPageUsingDataProvider;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
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


public class RegistrationTestUsingDataProviderJsonFile extends TestBase{
   HomePage homePage;
   RegistrationPageUsingDataProvider registrationPageUsingDataProvider;
   AssertionMessages assertionMessages;
    public String firstName , lastName , email , password;


    @Test(priority = 1,alwaysRun = true )
    @Severity(SeverityLevel.BLOCKER)
    @Description("Registration Function")
    @Link(name = "Register")

    public void UserCanRegister() throws IOException, ParseException {

        String path = System.getProperty("user.dir"+"src/test/java/Data/UserData.json");
        File file = new File(path);
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(file));
        for (Object jsonObj : jsonArray){
            JSONObject jsonObject = (JSONObject) jsonObj;
            firstName = (String) jsonObject.get("firstName");
            lastName = (String) jsonObject.get("lastName");
            email= (String) jsonObject.get("email");
            password= (String) jsonObject.get("password");
            homePage= new HomePage(driver);
            homePage.openRegistrationPage();
            registrationPageUsingDataProvider = new RegistrationPageUsingDataProvider(driver);

          registrationPageUsingDataProvider.Registration_Fun(firstName,lastName,email,password);
            assertionMessages = new AssertionMessages(driver);
            Assert.assertTrue(assertionMessages.Msg.getText().contains("Your registration completed"));
            driver.findElement(By.partialLinkText("Log")).click();
        }


}

 }

