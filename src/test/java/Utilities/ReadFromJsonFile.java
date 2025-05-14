package Utilities;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFromJsonFile {
    public static JSONObject ReadDataFromJson(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        JSONTokener jsonTokener = new JSONTokener(fileReader);
        JSONObject jsonObject = new JSONObject(jsonTokener);
        return jsonObject;

    }
}
