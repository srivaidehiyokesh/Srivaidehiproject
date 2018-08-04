package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import week3.day2.SeMethods;

public class CreateLeadReport {
	//@Test
	public static void main(String[] args) throws IOException{
	  
		 ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/result.html");
		 html.setAppendExisting(true);
		 ExtentReports extent =new ExtentReports();
		 extent.attachReporter(html);
		 ExtentTest suiteTest=extent.createTest("TC001","Creating New Lead");
		 ExtentTest test=suiteTest.createNode("Lead");
	        System.setProperty("webdriver.chrome.driver","F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
			//ChromeOptions max = new ChromeOptions();
	        //max.setHeadless(true);
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leaftaps.com/opentaps");
	       test.pass("browser launched",MediaEntityBuilder.createScreenCaptureFromPath("../snaps/createlead.png").build());
	        driver.findElementById("username").sendKeys("demosalesmanager");
	        driver.findElementById("password").sendKeys("crmsfa");
	        test.pass("user name & password entered");
	        driver.findElementByClassName("decorativeSubmit").click();
	        driver.findElementByLinkText("CRM/SFA").click();
	        driver.findElementByLinkText("Create Lead").click();
	        driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
	        driver.findElementById("createLeadForm_firstName").sendKeys("Lakshmi");
	        driver.findElementById("createLeadForm_lastName").sendKeys("Lakshmi");
	        driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Lakshmi");
	        driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Lakshmi");
	        driver.findElementById("createLeadForm_personalTitle").sendKeys("one");
	        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("MRS");
	        driver.findElementById("createLeadForm_annualRevenue").sendKeys("1000000");
	        WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
			Select sourceoption = new Select(Source);
			sourceoption.selectByIndex(7);
			WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
			Select industryoptions = new Select(Industry);
			industryoptions.selectByIndex(8);
			WebElement Owership = driver.findElementById("createLeadForm_ownershipEnumId");
			Select ownershipoptions = new Select(Owership);
			ownershipoptions.selectByIndex(5);
			driver.findElementById("createLeadForm_sicCode").sendKeys("001");
			driver.findElementById("createLeadForm_description").sendKeys("createLeads");
			driver.findElementById("createLeadForm_importantNote").sendKeys("createLeads");
			driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
			driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("01");
			driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("01");
			driver.findElementById("createLeadForm_departmentName").sendKeys("ECE");
			WebElement PreferredCurrency = driver.findElementById("createLeadForm_currencyUomId");
			Select preferredoptions = new Select(PreferredCurrency);
			preferredoptions.selectByIndex(5);
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("3");
			driver.findElementById("createLeadForm_tickerSymbol").sendKeys("three");
			driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("8951159910");
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("wwww.gmail.com");
			driver.findElementById("createLeadForm_generalToName").sendKeys("vishnu");
			driver.findElementById("createLeadForm_generalAddress1").sendKeys("No:11 vivekanandhastreet");
			driver.findElementById("createLeadForm_generalAddress2").sendKeys("No:18,vengopalswamystreet");
			driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
			WebElement ZipPostalCodeExtension = driver.findElementById("createLeadForm_currencyUomId");
			Select codeextension = new Select(ZipPostalCodeExtension);
			codeextension.selectByIndex(5);
			driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600073");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600073");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600073");
			WebElement country = driver.findElementById("createLeadForm_currencyUomId");
			Select countn = new Select(country);
			countn.selectByIndex(5);
			WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select stateoptions = new Select(state);
			stateoptions.selectByIndex(5);
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9884680880");
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("lakshmiramraj85@gmai.com");
			driver.findElementByClassName("smallSubmit").click();
			File src=driver.getScreenshotAs(OutputType.FILE);
			{
				File dest=new File("../snaps/createlead.png");
				FileUtils.copyFile(src, dest);
	}
			extent.flush();


}
}