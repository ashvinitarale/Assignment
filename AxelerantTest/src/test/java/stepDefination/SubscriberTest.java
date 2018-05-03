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
public class SubscriberTest {
	
	   WebDriver driver = null; 
	   MyStorePage mystorepage = null;
	   
	   @Given("^I am on automationpractice.com page$") 		
	   public void goToURL() { 
		  String driverPath = System.getProperty("webdriver.gecko.driver");
		  if (driverPath == null) {
			System.setProperty("webdriver.gecko.driver", "G:/geckodriver/geckodriver.exe");
		  } 
	      driver = new FirefoxDriver(); 
	      mystorepage = new MyStorePage(driver);
	      driver.navigate().to("http://automationpractice.com/index.php"); 
	      
	   }
		   	   
	   @When("^I enter email address in subscriber field \"(.*)\"$") 
	   public void enterEmailAddress(String email) {   
		   mystorepage.submitEmail(email);		   
	   }
		
	   @When ("^I click on submit button$") 
	   public void clickSubmit() {
		   mystorepage.clickSubmitNewsButton();
	   } 
	   	   
	   @Then("^Receive successfully subscribed message$") 
	   public void successMessage() {  
		  String successalert = mystorepage.getSuccesAlert();
		  
		  if(successalert.equalsIgnoreCase("Newsletter : You have successfully subscribed to this newsletter.")){
			  System.out.println("Subscriber test Pass");
		  } else {
			  System.out.println("Subscriber test Fail");
		  } 
		  driver.quit();
	   }
}
