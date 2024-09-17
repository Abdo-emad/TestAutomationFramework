package Tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends TestBase{
    HomePage homePage;
    @Test
    public void HoverOnElementThenClick(){

        homePage= new HomePage(driver);
        homePage.HoverOnElement();
        Assert.assertTrue(driver.getCurrentUrl().contains("noteBooks"));
    }
}
