package week6.day2;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.MyHomePage;
import week3.day2.Annotations;
import week3.day2.SeMethods;
import week6.day1.ReadExcel;

public class TC001_CreateLead extends Annotations {
	//@Test (groups= {"smoke"})
	//@Test(enabled=false)
	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLead";
		moduleName= "Leads";
		testCaseName="CreateLead";
		testDescription="Create Lead";
		category="sanity";
		author="sri";

	}
	@Test(dataProvider="fetchData")
	public void createLead(String cName, String fName, String lName) {
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.companyName(cName)
		.firstName(fName)
		.lastName(lName)
		.clickSubmit()
		.verifyFirstName(fName);

	}
}