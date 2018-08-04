package week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import week3.day2.SeMethods;
public class Flipkart extends SeMethods{
	@Test	
	public void productCompare() throws InterruptedException {
		startApp("chrome", "https://www.flipkart.com/");
		click(locateElement("xpath","//button[text()='✕']"));
		WebElement item1 = locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement item2 = locateElement("xpath","(//span[text()='Samsung'])[2]");
		Actions builder = new Actions(driver);
		builder.moveToElement(item1).perform();	
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(item2));
		click(item2);
		timeouts();
		WebElement minValue=locateElement("xpath", "//div[@class='_1qKb_B']//select");
		selectDropDownUsingValue(minValue, "25000");
		Thread.sleep(3000);
		WebElement maxValue=locateElement("xpath", "//div[@class='_1YoBfV']//select");
		selectDropDownUsingValue(maxValue, "60000");
		Thread.sleep(3000);	
		click(locateElement("xpath", "//div[text()='Screen Size']"));
		click(locateElement("xpath", "//div[text()='48 - 55']"));
		Thread.sleep(3000);
		click(locateElement("xpath", "//div[@class='_3wU53n'][1]"));
		switchToWindow(1);
		click(locateElement("xpath","//span[text()='Compare']"));
		closeBrowser();
		Thread.sleep(3000);
		switchToWindow(0);
		click(locateElement("xpath", "(//div[@class='_3wU53n'])[2]"));
		switchToWindow(1);
		click(locateElement("xpath", "//span[text()='Compare']"));
		click(locateElement("xpath", "//span[text()='COMPARE']"));
		//Thread.sleep(3000);
		WebElement firstPrice=locateElement("xpath", "//div[@class='_1k1axX _1DLH7w']//div[@class='_1vC4OE'][1]");
		String firstPriceStore=getText(firstPrice);
		int comparePriceOne= Integer.parseInt(firstPriceStore);
		WebElement secondPrice=locateElement("xpath", "//div[@class='col col-4-12 _1ouGhW']//div[@class='_1vC4OE'][2]");
		String secondPriceStore=getText(secondPrice);
		int comparePriceTwo= Integer.parseInt(secondPriceStore);
		if((comparePriceOne ==comparePriceTwo) || (comparePriceOne < comparePriceTwo)) {
			click(locateElement("xpath", "//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']//span[@class='_279WdV'][1]"));
		} else if((comparePriceOne > comparePriceTwo)) {
			click(locateElement("xpath", "//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']//span[@class='_279WdV'][2]"));
		}
	}
}
