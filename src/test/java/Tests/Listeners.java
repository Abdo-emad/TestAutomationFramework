package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.util.List;

import static Tests.TestBase.driver;

// Listener class should be configured in Testng.xml to run after success or after method failure
public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("TCs Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("TCs Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }





}
