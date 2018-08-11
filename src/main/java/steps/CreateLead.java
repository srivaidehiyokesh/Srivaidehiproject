package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public ChromeDriver driver;
	@Given("open the browser")
 public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","F:\\Testleaf\\Selenium\\Softwares and Videos-20180617T121850Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
    @And("maximize the window")
	 public void windowMaximize(){
			driver.manage().window().maximize();
    }
    
    @And("launch the url")
  	 public void launchUrl(){
    	 driver.get("http://leaftaps.com/opentaps");
      }
    
   

    @And("set the timeout")
  	 public void timeOut(){
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      }
    
    @And("Enter the username as (.*)")
 	 public void enterUsername(String uName){
    	driver.findElementById("username").sendKeys(uName);
     }
   
    @And("Enter the password as (.*)")
	 public void enterPassword(String pwd){
   	driver.findElementById("password").sendKeys(pwd);
    }
  
    @And("click the login")
  	 public void clickLogin(){
    	driver.findElementByClassName("decorativeSubmit").click();
      }
    @And("login failed")
	 public void loginFailed(){
  	System.out.println("Login failed");
    }
    @And("click the crmsfa")
 	 public void clickCrmsfa(){
    	driver.findElementByLinkText("CRM/SFA").click();
     } 
    @And("click on createlead")
	 public void clickCreateLead(){
   	driver.findElementByLinkText("Create Lead").click();
    } 
      
    @And("Enter the companyname as (.*)")
	 public void enterCompanyname(String cName){
   	driver.findElementById("createLeadForm_companyName").sendKeys(cName);
    }
  
    @And("Enter the firstname as (.*)")
	 public void enterFirstname(String fName){
  	driver.findElementById("createLeadForm_firstName").sendKeys(fName);
   }
    @And("Enter the lastname as (.*)")
	 public void enterLastname(String lName){
  	driver.findElementById("createLeadForm_lastName").sendKeys(lName);
  }
    @When("click the create lead button")
	 public void clickCreateLeadButton(){
  	driver.findElementByClassName("smallSubmit").click();
   } 
    
    @Then("verify the created lead")
    public void verifyCreatedLead() {
    	System.out.println("Lead has been created");
 }

}
