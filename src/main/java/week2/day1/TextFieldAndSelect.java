package week2.day1;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import okio.Options;


public class TextFieldAndSelect {



		public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver","F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
			//ChromeOptions max = new ChromeOptions();
	        //max.setHeadless(true);
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leaftaps.com/opentaps");
	        driver.findElementById("username").sendKeys("demosalesmanager");
	        driver.findElementById("password").sendKeys("crmsfa");
	        driver.findElementByClassName("decorativeSubmit").click();
	        driver.findElementByLinkText("CRM/SFA").click();
	        driver.findElementByLinkText("Create Lead").click();
	        driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
	        driver.findElementById("createLeadForm_firstName").sendKeys("lakshmi");
	        driver.findElementById("createLeadForm_lastName").sendKeys("vaidehi");
	        //driver.findElementById("createLeadForm_industryEnumId");
	        WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
	        Select options = new Select(industry);
	        //options.selectByIndex(8);
	        //options.selectByVisibleText("Insurance");
	        options.selectByValue("IND_INSURANCE");
	        List <WebElement> alloptions = options.getOptions();
	        int numberOfValues = alloptions.size();
	        System.out.println(numberOfValues);
	        //driver.findElementByClassName("smallSubmit").click();
	      
		}


}
