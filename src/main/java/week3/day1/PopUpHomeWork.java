package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHomeWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/");
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		String WindowHandle=driver.getWindowHandle();
		Set <String> allWindowHandle = driver.getWindowHandles();
		List <String> listOfWindows= new ArrayList <String>();
		listOfWindows.addAll(allWindowHandle);
		int noOfWindow=listOfWindows.size();
		System.out.println(noOfWindow);
		for(int i=1;i<noOfWindow;i++) {
			driver.switchTo().window(listOfWindows.get(i));
			driver.close();
		}
		

	}

}
