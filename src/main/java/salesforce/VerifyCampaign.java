package salesforce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day1.ReadExcel;
@Test
public class VerifyCampaign extends SalesAnnotations {

	@BeforeTest
	public void setValues() {
		excelFileName = "SalesforceLogin";
	} 
	
	@Test(dataProvider="fetchData")
	public void verifyCampaign(String UserName, String Password) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(UserName);
		driver.findElementById("password").sendKeys(Password);
		driver.findElementById("Login").click();
		driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
		driver.findElementByXPath("//div[@class='bRight']/div[text()='Marketing']").click();
		driver.findElementByXPath("//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container'][1]");
		driver.findElementByXPath("//span[text()='All Active Campaigns'][1]").click();
		driver.findElementByXPath("//span[text()='My Active Campaigns'][1]").click();        
		driver.findElementByXPath("//span[@class='uiImage']/img[@class='icon noicon']").click();
		driver.findElementByXPath("//a[text()='Log Out']").click();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(String excelFileName) throws IOException{
		
		ReadExcel excel =new ReadExcel();
		return excel.readExcel(excelFileName);
		
	}
}


