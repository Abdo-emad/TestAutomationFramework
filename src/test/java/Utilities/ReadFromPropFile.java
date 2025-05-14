package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropFile {
    public static String ReadDataFromPropFile(String key , String resource) throws IOException {
        Properties properties = new Properties();
        String path = System.getProperty("user.dir")+"./src/main/resources/"+resource;
        FileInputStream fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }
}
