package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("sri");
		driver.findElementById("userRegistrationForm:password").sendKeys("123456");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("123456");
		Thread.sleep(5000);
		WebElement securityQuestion =driver.findElementById("userRegistrationForm:securityQ");
		Select options=new Select(securityQuestion);
		options.selectByVisibleText("What was the name of your first school?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("jain");
		WebElement language =driver.findElementById("userRegistrationForm:prelan");
		Select langOpt =new Select(language);
		langOpt.selectByIndex(1);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Srivaidehi");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dobDay=driver.findElementById("userRegistrationForm:dobDay");
		Select date = new Select(dobDay);
		date.selectByValue("17");
		WebElement dobMonth=driver.findElementById("userRegistrationForm:dobMonth");
		Select month = new Select(dobMonth);
		month.selectByVisibleText("APR");
		WebElement dobYear = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select year= new Select(dobYear);
		year.selectByValue("1992");
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select occupationValue=new Select(occupation);
		occupationValue.selectByIndex(2);
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select ctry = new Select(country);
		ctry.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("sri@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9789993693");
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select nation=new Select(nationality);
		nation.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("Perungalathur");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600059",Keys.TAB);
		Thread.sleep(5000);
		Select city = new Select(driver.findElementById("userRegistrationForm:cityName"));
		city.selectByIndex(1);
		//Select city = new Select (driver.findElementById("userRegistrationForm:cityName",Keys.TAB));
		Thread.sleep(5000);
		WebElement post = driver.findElementById("userRegistrationForm:postofficeName");
		Select postOffice =new Select (post);
		postOffice.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("9789993693");




	}

}
