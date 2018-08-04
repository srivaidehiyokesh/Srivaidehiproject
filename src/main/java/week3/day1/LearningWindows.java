package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myAlert = driver.switchTo().alert();
		String alertMsg = myAlert.getText();
		System.out.println(alertMsg);
		myAlert.sendKeys("SrivaidehiLakshmi");
		myAlert.accept();
		Thread.sleep(5000);
		//driver.switchTo().frame("iframeResult");
		String msg=driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println(msg);
				driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[@id='tryhome']").click();
		String WindowHandle=driver.getWindowHandle();
		Set <String> allWindowHandle = driver.getWindowHandles();
		List <String> listOfWindows= new ArrayList <String>();
		listOfWindows.addAll(allWindowHandle);
		driver.switchTo().window(listOfWindows.get(1));
		System.out.println("Second Window");
		System.out.println(driver.getTitle() );
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listOfWindows.get(0));
		System.out.println("First Window");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
}
}