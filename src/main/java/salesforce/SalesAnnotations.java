package salesforce;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ReadExcel;

public class SalesAnnotations {

	public String excelFileName;
	@DataProvider(name="fetchData")
	public Object[][] getData(String excelFileName) throws IOException{
		
		ReadExcel excel =new ReadExcel();
		return excel.readExcel(excelFileName);
		
	}
}
