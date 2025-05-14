package TestListeners;

import Utils.FileUtils;
import Utils.logsUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestNgListener  implements ITestListener {
    public void onTestStart(ITestResult result) {
        logsUtil.info("Test Start");
    }

    public void onTestSuccess(ITestResult result) {
        logsUtil.info("Test Success");
    }

    public void onTestFailure(ITestResult result) {
        logsUtil.error("Test Failed");
    }

    public void onTestSkipped(ITestResult result) {
        logsUtil.trace("Test Skipped");
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
        try {
            File file = new File(System.getProperty("user,dir") + "./test-output");
            FileUtils.deleteFiles(file);
        } catch (IOException e) {
           logsUtil.error(e.getMessage());
        }
    }



}
