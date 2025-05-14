package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Waits {
    public WebElement WaitElementPresent(WebDriver driver,By locator){
       return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver1 -> driver1.findElement(locator));
    }

    public WebElement WaitTobeDisplayed(WebDriver driver, By locator){
        return new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(driver1 -> {
                   WebElement element = WaitElementPresent(driver,locator);
                  return element.isDisplayed() ? element : null;
                   }
                );
    }
    public WebElement WaitTobeClickable(WebDriver driver, By locator){
        return new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(driver1 -> {
                    WebElement element = WaitElementPresent(driver, locator);
                    return element.isEnabled() ? element : null;

                });
    }
}
