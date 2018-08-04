package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week3.day2.Annotations;

public class MyLeadsPage extends Annotations {
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	
	@FindBy(linkText="Merge Leads")
	WebElement eleMergeLead;
	
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	
	}
	
	public MergeLeadPage clickMergeLeads() {
		click(eleMergeLead);
		return new MergeLeadPage();
		
	}
	
}
