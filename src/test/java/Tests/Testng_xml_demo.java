package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Testng_xml_demo {

    @Test(timeOut = 300)//execution timeout for this TCs is 300 Ms
    @Parameters({"browser"})
    public void test1(@Optional("chrome") String browserName) throws IOException {
        System.out.println("1");
    }
    @Test(enabled = false) //skip this TCs from run
    public void test5() throws IOException {
        System.out.println("1");
    }
    @Test(groups = {"Regression"})
    public void test2() throws IOException {
        System.out.println("2");
    }
    @Test(groups = {"Regression"}) //using group key word means that u decide some tcs to be executed in the testng.xml file by using group tags
    public void MobileTest1() throws IOException {
        System.out.println("3");
    }
    @Test(groups = {"Regression"})
    public void MobileTest2() throws IOException {
        System.out.println("4");
    }

    }


