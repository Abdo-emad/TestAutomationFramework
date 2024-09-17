package Tests;

import Pages.AssertionMessages;
import Pages.HomePage;
import Pages.RegistrationPageUsingDataProvider;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;


public class RegistrationTestUsingDataProviderCSVFile extends TestBase{
   HomePage homePage;
   RegistrationPageUsingDataProvider registrationPageUsingDataProvider;
   AssertionMessages assertionMessages;
    CSVReader csvReader;



    @Test(priority = 1,alwaysRun = true )
    public void UserCanRegister() throws CsvValidationException, IOException {
        // get path of csv file
        String csv_File_Path = System.getProperty("user.dir"+"src/test/java/Data/CSVUserFile.csv");
        csvReader = new CSVReader(new FileReader(csv_File_Path));
        String [] csvCell;
        // Loop inside CSV File
        while ((csvCell = csvReader.readNext())!=null){
            String first_Name = csvCell[0];
            String last_Name = csvCell[1];
            String E_mail = csvCell[2];
            String password = csvCell[3];
            homePage= new HomePage(driver);
            homePage.openRegistrationPage();
            registrationPageUsingDataProvider = new RegistrationPageUsingDataProvider(driver);
            registrationPageUsingDataProvider.Registration_Fun(first_Name,last_Name,E_mail,password);
            assertionMessages = new AssertionMessages(driver);
            Assert.assertTrue(assertionMessages.Msg.getText().contains("Your registration completed"));
            driver.findElement(By.partialLinkText("Log")).click();
        }


}

 }

