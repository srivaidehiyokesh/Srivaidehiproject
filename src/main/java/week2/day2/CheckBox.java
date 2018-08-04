package week2.day2;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();
		/*boolean checkBox= driver.findElementByXPath("//div[@class='example']/input[1]").isSelected();
		System.out.println(checkBox);
		boolean checkBox1=driver.findElementByXPath("//section//following-sibling::div[@class='example'][2]/label[@for='java'][1]").isSelected();
		System.out.println(checkBox1);*/
		List <WebElement> box = driver.findElementsByXPath("//input[@type='checkbox']");
		int noOfBoxes=box.size();
		for (int i =1;i<=noOfBoxes;i++) {
		((WebElement) box).click();
		
		}
		//Select check = new Select(checkBox);
		System.out.println(noOfBoxes);
		
	}
}
		
