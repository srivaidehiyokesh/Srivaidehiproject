package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week3.day2.Annotations;

public class ViewLeadPage extends Annotations {
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;
	
	public void verifyFirstName(String expText) {
   verifyExactText(eleFirstName, expText);	
	}
	
}
