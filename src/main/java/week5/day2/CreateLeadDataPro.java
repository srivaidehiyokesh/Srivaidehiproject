package week5.day2;

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
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		Object[][] data = new Object[1][5];
		data[0][0]="cts";
		data[0][1]="vaidehi";
		data[0][2]="n";
		data[0][3]="9789993693";
		data[0][4]="sri@gmail.com";
		
		
		return data;
		
	}

}
