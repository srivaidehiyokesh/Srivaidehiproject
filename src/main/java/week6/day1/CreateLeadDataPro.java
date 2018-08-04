package week6.day1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week3.day2.Annotations;
import week3.day2.SeMethods;

public class CreateLeadDataPro extends Annotations {
	//@Test (groups= {"smoke"})
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName, String lName, String phoneNum, String mailID) {
		WebElement eleCreateLead = locateElement("LinkText", "Create Lead");
		eleCreateLead.click();
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, cName);
		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		type(firstName, fName);
		WebElement lastName = locateElement("id", "createLeadForm_lastName");
		type(lastName, lName);
		WebElement primaryPhoneNumber = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(primaryPhoneNumber, phoneNum);
		WebElement primaryEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(primaryEmail, mailID);
			}
	

}
