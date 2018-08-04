package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.switchTo().frame("childIframe");
		int count=driver.findElementsByXPath("//button[text()='Close Me']").size();
		System.out.println(count);
		for(int i=1;i<=count;i++) {
			//driver.switchTo().frame("childIframe");
			if(i==1) {
			driver.findElementByXPath("/html/body/div[2]/p/button[text()='Close Me']").click();	
			}
			if(i==2) {
				driver.findElementByXPath("/html/body/div[3]/p/button[text()='Close Me']").click();
			}
			Thread.sleep(5000);
		}
		driver.switchTo().defaultContent();
		int OutOfFrameCount=driver.findElementsByXPath("//div//p//button[text()='Close Me']").size();
		System.out.println(OutOfFrameCount);
		for(int i=1;i<=OutOfFrameCount;i++) {
					driver.findElementByXPath("/html/body/div/p/button[text()='Close Me']").click();	
		}
	}
}
