package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkJQuery {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com");
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame(0);
		String msg=driver.findElementByXPath("//div[@id='draggable']").getText();
		System.out.println(msg);
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();
	}

}
