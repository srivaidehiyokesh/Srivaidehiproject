package week5.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import week3.day2.Annotations;
import week3.day2.SeMethods;

public class CreateLead extends Annotations {
	//@Test (groups= {"smoke"})
	@Test
	public void createLead() {
		WebElement eleCreateLead = locateElement("LinkText", "Create Lead");
		eleCreateLead.click();
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, "CTS");
		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		type(firstName, "Lakshmi");
		WebElement lastName = locateElement("id", "createLeadForm_lastName");
		type(lastName, "Ramaraj");
		WebElement firstNameLocal = locateElement("id", "createLeadForm_firstNameLocal");
		type(firstNameLocal, "Vaidehi");
		WebElement lastNameLocal = locateElement("id", "createLeadForm_lastNameLocal");
		type(lastNameLocal, "Lakshmi");
		WebElement personalTitle = locateElement("id", "createLeadForm_personalTitle");
		type(personalTitle, "y");
		WebElement profileTitle = locateElement("id", "createLeadForm_generalProfTitle");
		type(profileTitle, "mrs");
		WebElement revenue = locateElement("id", "createLeadForm_annualRevenue");
		type(revenue, "10000");
		WebElement dataSource = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingIndex(dataSource, 7);
		WebElement industry = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingIndex(industry, 8);
		WebElement ownership = locateElement("id", "createLeadForm_ownershipEnumId");
		selectDropDownUsingIndex(ownership, 5);
		WebElement pinCode = locateElement("id", "createLeadForm_sicCode");
		type(pinCode, "001");
		WebElement desc = locateElement("id", "createLeadForm_description");
		type(desc, "createlead");
		WebElement importantNotes = locateElement("id", "createLeadForm_importantNote");
		type(importantNotes, "createlead");
		WebElement ctryCd = locateElement("id", "createLeadForm_primaryPhoneCountryCode");
		type(ctryCd, "91");
		WebElement areaCd = locateElement("id", "createLeadForm_primaryPhoneAreaCode");
		type(areaCd, "01");
		WebElement phoneExtCd = locateElement("id", "createLeadForm_primaryPhoneExtension");
		type(phoneExtCd, "01");
		WebElement departName = locateElement("id", "createLeadForm_departmentName");
		type(departName, "ECE");
		WebElement currency = locateElement("id", "createLeadForm_currencyUomId");
		selectDropDownUsingIndex(currency, 5);
		//switchToFrame(eleCreateLead);
		WebElement Noofemployees = locateElement("id", "createLeadForm_departmentName");
		type(Noofemployees, "3");
		WebElement Noofemployees1 = locateElement("id", "createLeadForm_departmentName");
		type(Noofemployees1, "3");
		WebElement ticketsymbol = locateElement("id", "createLeadForm_tickerSymbol");
		type(ticketsymbol, "three");
		WebElement Primaryphone = locateElement("id", "createLeadForm_primaryPhoneAskForName");
		type(Primaryphone, "8951159910");
		WebElement primaryWebUrl = locateElement("id", "createLeadForm_primaryWebUrl");
		type(primaryWebUrl, "wwww.gmail.com");
		WebElement generalToName = locateElement("id", "createLeadForm_generalToName");
		type(generalToName, "vishnu");
		WebElement generalAddress1 = locateElement("id", "createLeadForm_generalAddress1");
		type(generalAddress1, "No:11 vivekanandhastreet");
		WebElement generalAddress2 = locateElement("id", "createLeadForm_generalAddress2");
		type(generalAddress2, "No:18,vengopalswamystreet");
		WebElement generalCity = locateElement("id", "createLeadForm_generalCity");
		type(generalCity, "chennai");
		WebElement codeextension = locateElement("id", "createLeadForm_currencyUomId");
		selectDropDownUsingIndex(codeextension, 5);
		WebElement generalPostalCode = locateElement("id", "createLeadForm_generalPostalCode");
		type(generalPostalCode, "600073");
		WebElement country = locateElement("id", "createLeadForm_currencyUomId");
		selectDropDownUsingIndex(country, 5);
		WebElement state = locateElement("id", "createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingIndex(state, 5);
		WebElement primaryPhoneNumber = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(primaryPhoneNumber, "9884680880");
		WebElement generalPostalCodeExt = locateElement("id", "createLeadForm_generalPostalCodeExt");
		type(generalPostalCodeExt, "9884680880");
		WebElement primaryEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(primaryEmail, "lakshmiramraj85@gmai.com");
		WebElement elesubmit = locateElement("class", "smallSubmit");
		elesubmit.click();
	}

}
