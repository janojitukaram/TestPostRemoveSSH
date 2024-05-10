package ExcelRead;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiExcelMain {
	static XSSFWorkbook workbook;
	static XSSFSheet worksheet;
	
	public PoiExcelMain(String excelpath, String sheet )
	{
		try {
			workbook = new XSSFWorkbook(excelpath);
			worksheet = workbook.getSheet(sheet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static int rowCount() {
		int rowCount = 0;
		rowCount = worksheet.getPhysicalNumberOfRows();
		System.out.println("number of rows "+rowCount);
		return rowCount;
	}
	
	public static int ColumCount() {
		int colummCount = 0;
		XSSFRow row = worksheet.getRow(0);
		colummCount = row.getLastCellNum();
		System.out.println("number of columns "+colummCount);
		return colummCount;
	}

	public static String getStringData(int rowIndex, int colummIndex) {
		String StringData = worksheet.getRow(rowIndex).getCell(colummIndex).getStringCellValue();
		return StringData;
	}

	public static double getNumericData(int rowIndex, int colummIndex) {
		double NumericData = worksheet.getRow(rowIndex).getCell(colummIndex).getNumericCellValue();

		return NumericData;

	}

}
