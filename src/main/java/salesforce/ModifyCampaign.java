package salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyCampaign {
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

	}

}



