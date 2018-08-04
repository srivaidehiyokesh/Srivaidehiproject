package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week3.day2.Annotations;

public class CreateLeadPage extends Annotations {
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy(name="submitButton")
	WebElement elesubmit;
	
	@FindBy(className="errorList")
	WebElement errMsg;
	
	public CreateLeadPage companyName(String cName) {
		type(eleCompanyName, cName);
		return this;
	}
	public CreateLeadPage firstName(String fName) {
		type(eleFirstName, fName);
		return this;
	}
	public CreateLeadPage lastName(String lName) {
		type(eleLastName, lName);
		return this;
	}
	
	public CreateLeadPage clickSubmitErrMsg(String errorMessage){
		click(elesubmit);
		verifyPartialText(errMsg, errorMessage);
			return this;
	}
	
	public ViewLeadPage clickSubmit() {
		click(elesubmit);
	return new ViewLeadPage();
	}
	
}
