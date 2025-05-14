package Utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public static void deleteFiles(File path) throws IOException {
        org.apache.commons.io.FileUtils.cleanDirectory(path);

    }
}
