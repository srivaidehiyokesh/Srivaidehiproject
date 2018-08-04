package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel2 {
	@Test
	public void readExcel() throws IOException {
		XSSFWorkbook wBook= new XSSFWorkbook("./Data/Login.xlsx");
		XSSFSheet sheet=wBook.getSheet("login");
		int rowCount=sheet.getLastRowNum();
		int columnCount=sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row=sheet.getRow(i);
			for (int j=0;j<columnCount; j++) {
				XSSFCell cell=row.getCell(j);
				String data=cell.getStringCellValue();
				System.out.println(data);
			}
		}
		
	}


	
}