package demo.orangehrm.framework.file.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	//This class contains a method to read data from an Excel file and return it as a 2D String array.

    public static String[][] readExceldata(String fileName, String sheetName) {
        String[][] data = null;
        
        // Using try-with-resources to ensure streams are closed properly

        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);
            
        	// Creating an XSSFWorkbook object to read the Excel file
        	
        	XSSFWorkbook wb = new XSSFWorkbook(fis)) {
        	
        	// Accessing the specified sheet in the workbook

            XSSFSheet sh = wb.getSheet(sheetName);
            
            // Getting the total number of rows and columns in the sheet

            int totalNoOfRows = sh.getPhysicalNumberOfRows();
            int totalNoOfCols = sh.getRow(0).getPhysicalNumberOfCells();
            
            // Initializing the 2D array to hold the data (excluding header row)
            
            data = new String[totalNoOfRows - 1][totalNoOfCols];

            for (int r = 1; r < totalNoOfRows; r++) {
                for (int c = 0; c < totalNoOfCols; c++) {

                    if (sh.getRow(r).getCell(c) != null) {
                        data[r - 1][c] = sh.getRow(r).getCell(c).toString();
                    } else {
                        data[r - 1][c] = "";
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
