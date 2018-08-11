package salesforce;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateCampaign {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("srivaidehi@wipro.com");
		driver.findElementById("password").sendKeys("Sudha@1718");
		driver.findElementById("Login").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//div[@class='bRight']/div[text()='Marketing']").click();
		driver.findElementByXPath("//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container'][1]").click();
		driver.findElementByXPath("//span[text()='New Campaign']").click();
		driver.findElementByXPath("//div[@class='uiInput uiInputText uiInput--default uiInput--input']/input[@class=' input']").sendKeys("Sample2");
		driver.findElementByXPath("//div[@class='form-element']/input[@class=' input'][1]").sendKeys("8/7/2018");
		driver.findElementByXPath("//div[@class='form-element']/input[@class=' input'][2]").sendKeys("8/10/2018");
		driver.findElementByXPath("//span[text()='Save & New']").click();
		driver.findElementByXPath("//button[@class='slds-button slds-modal__close closeIcon slds-button_icon-bare slds-button_icon-inverse']").click();
		driver.findElementByXPath("//a[text()='Log Out']").click();
	}

}

