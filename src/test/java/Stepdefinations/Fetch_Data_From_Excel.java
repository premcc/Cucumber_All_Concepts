package Stepdefinations;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetch_Data_From_Excel {

	public  static void dataprovide() throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\heman\\OneDrive\\Desktop\\orangehrm.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(fis);

		//List<String> data = new ArrayList<String>();
		XSSFSheet sheet = book.getSheet("ORHRM");
		int countRows = sheet.getPhysicalNumberOfRows();
		int lastCell = sheet.getRow(0).getLastCellNum();
		DataFormatter df = new DataFormatter();
		for (int i = 1; i < countRows; i++) {
			for (int j = 0; j < lastCell; j++) {
				String value = df.formatCellValue(sheet.getRow(i).getCell(j));
				
				System.out.println(value);
			}
		}
		
		

	}
	
	public static void main(String[] args) throws Throwable {
		Fetch_Data_From_Excel.dataprovide();
		
	}
}
