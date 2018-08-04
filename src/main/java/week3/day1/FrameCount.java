package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		int noOfFrames=driver.findElements(By.xpath("//iframe")).size();
		System.out.println(noOfFrames);
		int noOfChildFrame;
		for(int i=1; i<=noOfFrames;i++) {
		driver.switchTo().frame(i);
		if (driver.findElement(By.xpath("//iframe")).isDisplayed()) {
		 noOfChildFrame=driver.findElements(By.xpath("//iframe")).size();
		System.out.println(noOfChildFrame);
		System.out.println(noOfFrames+noOfChildFrame);
		}
		else 
			driver.switchTo().defaultContent();
		}
		
		
		
		}
		
			

	}
