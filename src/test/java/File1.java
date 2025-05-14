import Utilities.ReadFromPropFile;

import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException {
        System.out.println(ReadFromPropFile.ReadDataFromPropFile("Email","get.properties"));
    }

}
