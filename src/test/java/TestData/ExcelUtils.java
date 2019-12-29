package TestData;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtils {

	static FileInputStream fis = null;
	DataFormatter formatter = new DataFormatter();

	public FileInputStream getFileInputStream() {
		String filePath = System.getProperty("user.dir") + "/src/test/java/TestData/Data3.xlsx";
		File srcFile = new File(filePath);

		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found. treminating Process !! : Check file path of TestData");
			System.exit(0);
		}
		return fis;
	}

	// Method to return the excel data , 1st parameter is the index of the sheet you
	// want to get the data from(0,1,2,..) , 2nd parameter is the number of columns
	// in that sheet
	// and it will return the data into 2 dimension array
	public Object[][] getExcelData(int index, int coloumn) throws IOException {
		fis = getFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(index);

		int TotalNumberOfRows = (sheet.getLastRowNum() + 1);
		// System.out.println("rows"+TotalNumberOfRows);

		int TotalNumberOfCols = coloumn;
		// System.out.println("col "+TotalNumberOfCols);

		String[][] arrayExcelData = new String[TotalNumberOfRows - 1][TotalNumberOfCols];

		for (int i = 1; i < TotalNumberOfRows; i++) {
			for (int j = 0; j < TotalNumberOfCols; j++) {
				// XSSFRow row = sheet.getRow(i);

				arrayExcelData[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue(); // row.getCell(j).toString();
				// Double value = sheet.getRow(i).getCell(0).getNumericCellValue();
				// System.out.print("cell value= "+value);
				// arrayExcelData[i-1][j] =
				// formatter.formatCellValue(sheet.getRow(i).getCell(j)); //
				// row.getCell(j).toString();

				// System.out.println(arrayExcelData [i][j].toString() + " ");
			}
		}

		wb.close();
		return arrayExcelData;
	}
}
