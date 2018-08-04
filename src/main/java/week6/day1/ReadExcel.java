package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public Object[][] readExcel(String fileName) throws IOException {
		XSSFWorkbook wBook= new XSSFWorkbook("./Data/"+fileName+".xlsx");
		XSSFSheet sheet=wBook.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		int columnCount=sheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[rowCount][columnCount];
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row=sheet.getRow(i);
			for (int j=0;j<columnCount; j++) {
				try {
					XSSFCell cell=row.getCell(j);
					data[i-1][j]=cell.getStringCellValue();
				} catch (Exception e) {
					data[i-1][j]="";
				}
			}
		}
		wBook.close();
		return data;

	}



}