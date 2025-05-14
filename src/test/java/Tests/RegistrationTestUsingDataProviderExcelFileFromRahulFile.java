package Tests;

import Data.RahulShettyWayToReadFromExcelFile;
import Data.ReadFromExcelFile;
import Pages.AssertionMessages;
import Pages.HomePage;
import Pages.RegistrationPageUsingDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class RegistrationTestUsingDataProviderExcelFileFromRahulFile extends TestBase{
   HomePage homePage;
   RegistrationPageUsingDataProvider registrationPageUsingDataProvider;
   AssertionMessages assertionMessages;

    /*
@DataProvider(name = "DataDrivenTest")
public static Object[][] RegistrationData() {
    //Get data from ExcelReaderClass

ExcelReader excelReader = new ExcelReader();
    return excelReader.FileReader;
}*/
    @DataProvider(name = "DataDrivenTest")
    public  Object[][] RegistrationData() throws IOException {
        //Get data from ExcelReaderClass
        RahulShettyWayToReadFromExcelFile file = new RahulShettyWayToReadFromExcelFile();
       return file.AccessExcelSheet();
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

