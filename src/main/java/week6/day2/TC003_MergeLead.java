package week6.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import week3.day2.Annotations;

public class TC003_MergeLead extends Annotations {
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
