package Data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromJsonFile {
    public String firstName , lastName , email , password;

    public void ReadFromJson() throws IOException, ParseException {
        String path = System.getProperty("user.dir"+"src/test/java/Data/UserData.json");
        File file = new File(path);
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(file));
        for (Object jsonObj : jsonArray){
            JSONObject jsonObject = (JSONObject) jsonObj;
            firstName = (String) jsonObject.get("firstName");
            lastName = (String) jsonObject.get("lastName");
            email= (String) jsonObject.get("email");
            password= (String) jsonObject.get("password");
        }
    }
}
