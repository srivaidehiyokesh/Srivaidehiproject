package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week3.day2.Annotations;

public class MergeLeadPage extends Annotations {
	public MergeLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Merge Leads")
	WebElement eleMergeLead;

	@FindBy(xpath="//input[@id='partyIdFrom']/following::a[1]")
	WebElement eleFromId;

	@FindBy(xpath="xpath\", \"//input[@id='partyIdTo']/following::a[1]")
	WebElement eleToId;

	@FindBy(linkText="Merge")
	WebElement eleMerge;


	public MergeLeadPage fromId(String fromid) {
		type(eleFromId, fromid);
		return this;
	}

	public MergeLeadPage toId(String toid) {
		type(eleToId, toid);
		return this;
	}
	
	//public ViewLeadPage clickSubmit() {
		//click(eleMerge);
	//return new ViewLeadPage();
//}
}