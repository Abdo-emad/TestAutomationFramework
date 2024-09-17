package Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper1 {

    public static void ScreenCapture(WebDriver driver, String name) throws IOException {
       Path des = Paths.get("/ScreenShots/"+name + ".png");
        Files.createDirectory(des.getParent());
        FileOutputStream fileOutputStream = new FileOutputStream(des.toString());
        fileOutputStream.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
        fileOutputStream.close();
           }
}
