package Data;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Class To read From Excel File
public class ReadFromExcelFile {

    static FileInputStream fileInputStream = null;

    public FileInputStream getFileInputStream() throws FileNotFoundException {
        String des = System.getProperty("user.dir"+"src/test/java/Data/UserRegistrationData.xlsx");
        File file = new File(des);
        fileInputStream = new FileInputStream(file);
        return fileInputStream;

    }

    public Object[][] FileReader() throws IOException {
        fileInputStream = getFileInputStream();
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        int NumberOfRows =(xssfSheet.getLastRowNum()+1);
        int NumberOfColumns = 4;
        String [][] SheetArray = new String[NumberOfRows][NumberOfColumns];
        for (int i=0; i<NumberOfRows;i++){
            for (int j=0 ; j<NumberOfColumns;j++){
                XSSFRow xssfRow = xssfSheet.getRow(i);
                SheetArray[i][j]= xssfRow.getCell(j).toString();
            }
        }
      xssfWorkbook.close();
        return SheetArray;
    }
}