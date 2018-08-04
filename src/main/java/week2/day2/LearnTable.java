package week2.day2;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		int size = driver.findElementsByXPath("//table//tr").size();
		System.out.println(size);
		int columns = driver.findElementsByXPath("//table//tr[2]/td").size();
		System.out.println(columns);
		String learnToValue = driver.findElementByXPath("//table//tr[3]/td[2]").getText();
		System.out.println(learnToValue);

	}


}
