package Utils;

import java.io.File;

public class AllureResultsCleaner {

    public static void deleteAllureResults(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Directory '" + directoryPath + "' does not exist.");
            return;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                }
            }
        }

        System.out.println("Allure results files deleted from: " + directoryPath);
    }
}
