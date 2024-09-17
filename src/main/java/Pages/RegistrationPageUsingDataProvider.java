package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageUsingDataProvider extends PageBase{

    public RegistrationPageUsingDataProvider(WebDriver driver) {
        super(driver);
    }

    By male_radio_btn = By.id("gender-male");
    WebElement Male_gender = driver.findElement(male_radio_btn);
    By fName = By.id("FirstName");
    WebElement FirstName = driver.findElement(fName);
    By lName = By.id("LastName");
    WebElement LastName = driver.findElement(lName);
    By Email= By.id("Email");
    WebElement E_Mail = driver.findElement(Email);
    By pass= By.id("Password");
    WebElement Password = driver.findElement(pass);
    By confirm_pass= By.id("ConfirmPassword");
    WebElement Confirm_Password = driver.findElement(confirm_pass);
    By register_btn= By.id("register-button");
    WebElement Register_Button= driver.findElement(register_btn);



    public void Registration_Fun(String F_Name , String L_Name , String e_Mail , String Pass ){
        Click(Male_gender);
        SendValue(FirstName,F_Name);
        SendValue(LastName,L_Name);
        SendValue(E_Mail,e_Mail);
        SendValue(Password,Pass);
        SendValue(Confirm_Password,Pass);
        Click(Register_Button);

    }

}
