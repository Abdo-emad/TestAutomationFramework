package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
       javascriptExecutor = (JavascriptExecutor) driver;
       actions = new Actions(driver); //Used to hover on element then select element
    }

    By registerBtn = By.linkText("Register");
    WebElement RegistrationButton = driver.findElement(registerBtn);
    By login = By.linkText("Log in");
    WebElement login_btn = driver.findElement(login);
  /*  By computersHover= By.linkText("Computers");
    WebElement Computers= driver.findElement(computersHover);
    By notebookHover = By.linkText("Notebooks");
    WebElement Notebook = driver.findElement(notebookHover);*/
    public void openRegistrationPage(){
        Click(RegistrationButton);
    }

    public void UserLogin(){
        Click(login_btn);
    }
public void  ContactUsPage(){
    scrollDown();
}
public void HoverOnElement(){
       // actions.moveToElement(Computers).moveToElement(Notebook).click().build().perform();
}
}
