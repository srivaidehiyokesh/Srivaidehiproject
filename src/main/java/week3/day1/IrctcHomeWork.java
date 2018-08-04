package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcHomeWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByLinkText("Contact Us").click();
		String WindowHandle1=driver.getWindowHandle();
		Set <String> allWindowHandle1 = driver.getWindowHandles();
		List <String> listOfWindows1= new ArrayList <String>();
		listOfWindows1.addAll(allWindowHandle1);
		driver.switchTo().window(listOfWindows1.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listOfWindows1.get(0));
		driver.findElementByLinkText("Compatible Browser").click();
		String WindowHandle=driver.getWindowHandle();
		Set <String> allWindowHandle = driver.getWindowHandles();
		List <String> listOfWindows= new ArrayList <String>();
		listOfWindows.addAll(allWindowHandle);
		driver.switchTo().window(listOfWindows.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listOfWindows.get(1));
		driver.close();
		driver.switchTo().window(listOfWindows.get(0));
		driver.close();
		driver.switchTo().window(listOfWindows.get(2));
		String browsers=driver.findElementByXPath("//td//div[@class=\"content_12\"]").getText();
		System.out.println(browsers);	
	}
}

