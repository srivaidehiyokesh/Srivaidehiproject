package week3.day2;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class MergeLead extends Annotations {

	//@Test(dependsOnMethods= {"week3.day2.CreateLead.createLead"})
	//@Test(timeOut=5000)
	//@Test(groups= {"sanity"})
	@Test
	public void MergeLead() throws InterruptedException {
	Thread.sleep(6000);
		WebElement eleLeads = locateElement("LinkText", "Leads");
		eleLeads.click();
		WebElement eleMergeLeads = locateElement("LinkText", "Merge Leads");
		eleMergeLeads.click();
		click(locateElement("xpath", "//input[@id='partyIdFrom']/following::a[1]"));
		switchToWindow(1);
		WebElement eleLeadid = locateElement("name", "id");
		type(eleLeadid, "10039");
		WebElement eleFindLeads = locateElement("xpath", "//td[@class='x-btn-center']");
		eleFindLeads.click();
		Thread.sleep(5000);
		// WebElement eleFirstResult = locateElement("xpath",
		// "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		// eleFirstResult.click();
		// click(locateElement("xpath","//div[@class='x-grid3-cell-inner
		// x-grid3-col-partyId']/a"));
		clickNoSnap(locateElement("xpath", "//a[@class='linktext']"));
		Thread.sleep(2000);
		timeouts();
		switchToWindow(0);
		click(locateElement("xpath", "//input[@id='partyIdTo']/following::a[1]"));
		switchToWindow(1);
		WebElement eleLeadids = locateElement("name", "id");
		type(eleLeadids, "10040");
		click(locateElement("xpath", "//td[@class='x-btn-center']"));
		// WebElement findLeads = locateElement("xpath", "//button[text()='Find
		// Leads']");
		// findLeads.click();
		Thread.sleep(2000);
		clickNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		// WebElement firstResults = locateElement("xpath",
		// "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		// firstResults.click();
		timeouts();
		switchToWindow(0);
		WebElement eleMergeLeadss = locateElement("LinkText", "Merge");
		eleMergeLeadss.click();
		acceptAlert();
		WebElement eleFindLeadss = locateElement("LinkText", "Find Leads");
		eleFindLeadss.click();
		type(locateElement("name", "id"), "10000");
		WebElement findLeass = locateElement("xpath", "//button[text()='Find Leads']");
		findLeass.click();
		verifyExactText(locateElement("xpath", "//div[contains(text(),'No records to display')]"),
				"No records to display");
		
	}

}
