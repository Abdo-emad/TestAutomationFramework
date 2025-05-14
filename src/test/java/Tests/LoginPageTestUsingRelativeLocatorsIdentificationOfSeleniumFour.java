/*
package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class LoginPageTestUsingRelativeLocatorsIdentificationOfSeleniumFour extends TestBase{
    SoftAssert softAssert = new SoftAssert();

    private static final Logger log = LoggerFactory.getLogger(LoginPageTestUsingRelativeLocatorsIdentificationOfSeleniumFour.class);
    //ReadValidDataFromJson readValidDataFromJson;

*/
/*Keywords used to identify selenium 4 relative locators are:
    1-above
    2-below
    3-near
    4-toLeftOf
    5-toRightOf
    WebElement UserNameEditBoxWebElement = driver.findElement(By.cssSelector("[name='userName']"));
     driver.findElement(with(By.tagName("desiredElement_U_Need")).above("WebElement of near element));*//*

    @Test
    public void loginByLeavingAllFieldsEmpty(){
        WebElement UserNameEditboxWebElement = driver.findElement(By.cssSelector("[name='userName']"));
        driver.findElement(with(By.tagName("label")).above(UserNameEditboxWebElement));
        loginPage.setUserNameField("");
        loginPage.setUPasswordField("");
        loginPage.clickOnLoginButton();
        softAssert.assertTrue(loginPage.CheckRequiredErrorMessageWhileLeavingAllFieldsEmpty());
    }


}
*/
