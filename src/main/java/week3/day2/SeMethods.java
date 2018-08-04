package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.annotation.NoClass;
import week5.day2.Reporter;

public class SeMethods extends Reporter implements WdMethods{
	public static RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			 driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//System.out.println("The Browser "+browser+" is Launched Successfully");
		reportStep("Browser launched successfully", "pass");
		takeSnap();
		
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "LinkText":return driver.findElementByLinkText(locValue); 
			case "name":return driver.findElementByName(locValue); 
			}
		} catch (NoSuchElementException e) {
			reportStep("Nosuch element found", "fail");
			
		}
		catch (NullPointerException e) {
			reportStep("Null pointer Exception occured", "fail");
			
		}
		catch (WebDriverException e) {
			reportStep("Web Driver Exception occured", "fail");
			throw new RuntimeException();
			
		}
		catch (Exception e) {
			reportStep("Exception occured", "fail");
		}
		finally{
			takeSnap();
			
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		//System.out.println("The Data "+data+" is Entered Successfully");
		reportStep("Data entered successfully", "pass");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		//System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("Element Clicked successfully", "pass");
		takeSnap();	
	}
	

	public String getText(WebElement ele) {
		String text=ele.getText();
		//System.out.println("the text is retrived" +text);
		reportStep("Text is retrieved successfully", "pass");
		return text;
	}
	

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select option = new Select(ele);
			option.selectByVisibleText(value);
			//System.out.println("Drop down value " +value+ " is selected");
			reportStep("Dropdown value selected", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Dropdown value not selected", "fail");
		}
		finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
	
		try {Select option = new Select(ele);
		option.selectByIndex(index);
		reportStep("Dropdown value selected", "pass");
	}
		catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Dropdown value not selected", "fail");
		}
		finally {
			takeSnap();
		}
		
	}
	public void selectDropDownUsingValue(WebElement ele, String Value) {
		try {Select option = new Select(ele);
		option.selectByValue(Value);
		reportStep("Dropdown value selected", "pass");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Dropdown value not selected", "fail");
		}
		finally {
			takeSnap();
		}
	}
	public void getTitle() {
		System.out.println(driver.getTitle());

		}

	public boolean verifyTitle(String expectedTitle) {
	String title=	driver.getTitle();
	boolean b;
	if (expectedTitle.equals(title)) {
		b=true;
		System.out.println("The expected title is same as current title");
	}else {
		b=false;
		System.out.println("The expected title is not same as current title");
	}
return b;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		
		String text=ele.getText();
		if (expectedText.equals(text)) {
			System.out.println("The expected text is same as current text");
		}else {
			System.out.println("The expected text is not same as current text");
		}
		}

	public void verifyPartialText(WebElement ele, String expectedText) {
		String partialtext=ele.getText();
		if (expectedText.contains(expectedText)) {
			reportStep("Expected text matched", "pass");
		}else {
			reportStep("Expected text not the same", "fail");
		}
		
		
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).equals(value))
		{
		System.out.println("the given attribute value is matched");
		}else {
			System.out.println("the given attribute value is matched");
		}
		}
	
		

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifySelected(WebElement ele) {
		ele.isSelected();
        System.out.println("the element is selected");
	}

	public void verifyDisplayed(WebElement ele) {
		ele.isDisplayed();
		System.out.println("the element is displayed");
	}

	
	public void switchToWindow(int index) {
	try {
		Set <String> allWindows = driver.getWindowHandles()	;
		List <String> listOfWindows =new ArrayList<String>();
		listOfWindows.addAll(allWindows);
		driver.switchTo().window(listOfWindows.get(index));
	} catch (NoSuchWindowException e) {
		System.err.println("Exception occured as no window found");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.err.println("Exception occured as no window found");
	}
	catch (WebDriverException e) {
		System.err.println("Exception has occured ...");
		throw new RuntimeException();
	}
	 finally {
	System.out.println("Switched to window successfully");
	//takeSnap();
	}
	}

	public void switchToFrame(WebElement ele) {
		try {		
		driver.switchTo().frame(ele);
		}
	catch (NoSuchFrameException e) {
		System.err.println("Exception occured as no frame found");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.err.println("Exception occured as no frame found");
	}
	catch (WebDriverException e) {
		System.err.println("Exception has occured");
		throw new RuntimeException();
	}
	 finally {
		 System.out.println("Switched to frame successfully");
		 //takeSnap();	
	 }
	 }

	public void acceptAlert() {
		 try{
			 driver.switchTo().alert().accept();
		 }
		 catch (NoAlertPresentException e) {
				System.err.println("Exception occured as no alert found");
			}
			catch (WebDriverException e) {
				System.err.println("Exception has occured");
				throw new RuntimeException();
			}
	}

	public void dismissAlert() {
		try{
			 driver.switchTo().alert().dismiss();
		 }
		 catch (NoAlertPresentException e) {
				System.err.println("Exception occured as no alert found");
			}
			catch (WebDriverException e) {
				System.err.println("Exception has occured");
				throw new RuntimeException();
			}
			}

	public String getAlertText() {
		String alertMsg=null; 
		try {
			alertMsg= driver.switchTo().alert().getText();
		System.out.println("Alert msg retreived");	
		
			}
		
		catch (NoAlertPresentException e) {
			System.err.println("Exception occured as no alert found");
		}
		catch (WebDriverException e) {
			System.err.println("Exception has occured");
			throw new RuntimeException();
		}
		return alertMsg;
		
	}
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void clickNoSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is not clicked Successfully");	
		}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("the current browser is closed");
		//takeSnap();
	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("all the  browsers are closed");
		
	}

	public void timeouts() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("all the  timeout are closed");
		
	}
}
