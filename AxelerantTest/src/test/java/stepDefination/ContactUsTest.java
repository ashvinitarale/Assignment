/**
 * 
 */
package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MyStorePage;
/**
 * @author Ashvini
 *
 */
public class ContactUsTest {
	   WebDriver driver = null; 
	   MyStorePage myStorePage = null;
	   
	   @Given("^I am on automationpractice page$") 		
	   public void goToAutomationPractice() { 
		  String driverPath = System.getProperty("webdriver.gecko.driver");
		  if (driverPath == null) {
			System.setProperty("webdriver.gecko.driver", "G:/geckodriver/geckodriver.exe");
		  } 
	      driver = new FirefoxDriver(); 
	      myStorePage = new MyStorePage(driver);
	      driver.navigate().to("http://automationpractice.com/index.php"); 
	   }
	   
	   @When("^I click on Contact Us link$") 
	   public void clickOnContactUs() {
		   myStorePage.clickOnContactUsLink();
	   }
		   	   
	   @When("^I choose Subject Heading as \"(.*)\"$") 
	   public void enterSubjectHeading(String subject) {   
		   myStorePage.enterSubjectHeading(subject);	      
	   }
		
	   @When ("^I enter Email Address as \"(.*)\"$") 
	   public void enterEmail(String email) {
		   myStorePage.enterContactUsEmail(email); 	      
	   } 
		
	   @When ("^I enter Message as \"(.*)\"$") 
	   public void enterMessage(String message) {
		   myStorePage.enterContactUsMessage(message);
	   } 
	   
	   @When("^I click on send button$") 
	   public void clickOnSend() {
		   myStorePage.clickOnSendButton();
	   }
	   
	   @Then("^Message send success alert$") 
	   public void successMessage() {  
		  String successalert = driver.findElement(By.xpath(".//*[@class='alert alert-success']")).getText();
		  
		  if(successalert.equalsIgnoreCase("Your message has been successfully sent to our team.")){
			  System.out.println("Contact Us test Pass");
		  } else {
			  System.out.println("Contact Us test Fail");
		  } 
		  driver.quit();
	   }
		
	   @Then("^error alert should be available$") 
	   public void checkRelogin() { 
		  String error = driver.findElement(By.xpath(".//*[@class='alert alert-danger']")).getText();
		  if(error.contains("Invalid email address.")){
			  System.out.println("Invalid email error test Pass");
		  } else {
			  System.out.println("Invalid emai error test Fail");
		  } 
	      driver.quit(); 
	   }

}
