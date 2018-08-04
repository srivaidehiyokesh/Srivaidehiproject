package week3.day2;

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

public class Annotations extends SeMethods {
	public String excelFileName,testCaseName,testDescription,moduleName,author,category;
	@BeforeSuite
	public void startSuite() {
		beginResult();
	}
	@BeforeClass
	public void startTest() {
		startTest(testCaseName, testDescription);
	}
	@Parameters({"url", "username","password"})
	@BeforeMethod(groups= {"sanity","smoke"})
	public void login(String url, String username, String password){
		startTestIteration(moduleName,author,category);
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePwd = locateElement("id", "password");
		type(elePwd, password);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		eleLogin.click();
		WebElement eleCrmsfa = locateElement("LinkText", "CRM/SFA");
		eleCrmsfa.click();
	}

	@AfterMethod(groups= {"sanity","smoke"})
	public void close() {
		closeBrowser();
	}
	@AfterSuite
	public void endResults() {
		endResult();
	}
	@DataProvider(name="fetchData")
	public Object[][] getData() throws IOException{
		ReadExcel excel =new ReadExcel();
		return excel.readExcel(excelFileName);
		
	}
}
