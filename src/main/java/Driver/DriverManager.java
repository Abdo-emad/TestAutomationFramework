package Driver;

import Utils.logsUtil;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class DriverManager {
    //فايده ال thread local دي هو in case في حاله انك عاوز تطبق الباراراريل اكسيكيونش تضمن انه بيرجعلك    فتقدر تفتح اكتر من سيشن كل سيشن جواها درايفر خاص بيها only one instance for each session
    public static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    private DriverManager(){
        super();
    }
    public  static WebDriver getDriver(){
        if (driverThreadLocal.get()==null){
            logsUtil.info("browser equal null");
            fail("driver is null");
        }

       return driverThreadLocal.get();

    }

    public static WebDriver CreateInstance(String browserName){
        WebDriver driver= BrowserFactory.getBrowser(browserName);
        logsUtil.info("browserName", browserName);
        setDriver(driver);
        return getDriver();
    }
    // then you can write below line in test base
    // WebDriver driver = DriverManager.CreateInstance("chrome");
    public  static void setDriver(WebDriver driver){
        driverThreadLocal.set(driver);
    }
}
