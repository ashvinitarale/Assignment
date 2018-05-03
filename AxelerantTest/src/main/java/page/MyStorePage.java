/**
 * 
 */
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ashvini
 *
 */
public class MyStorePage {
	
	public MyStorePage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "newsletter-input") 
	private WebElement newletterfield;
	
	@FindBy(how = How.NAME, using = "submitNewsletter") 
	private WebElement submitNewsletterButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='alert alert-success']") 
	private WebElement successalert;
	
	@FindBy(how = How.ID, using = "contact-link") 
	private WebElement contactUsLink;
	
	@FindBy(how = How.ID, using = "id_contact") 
	private WebElement subjectHeading;
	
	@FindBy(how = How.ID, using = "email") 
	private WebElement contactUsEmail;
	
	@FindBy(how = How.ID, using = "message") 
	private WebElement contactUsMessage;
	
	@FindBy(how = How.ID, using = "submitMessage") 
	private WebElement sendMessage;
	
	@FindBy(how = How.ID, using = "search_query_top")
	private WebElement searchQuery;
	
	@FindBy(how = How.NAME, using = "submit_search")
	private WebElement submitSearchQuery;
		
	public void submitEmail(String email){
		newletterfield.sendKeys(email);		
	}
	
	public void clickSubmitNewsButton(){
		submitNewsletterButton.click();
	}
	
	public String getSuccesAlert(){
		return successalert.getText();
	}
	
	public void clickOnContactUsLink() {
		contactUsLink.click();
	}
	
	public void enterSubjectHeading(String subject) {
		subjectHeading.sendKeys(subject);
	}
	
	public void enterContactUsEmail(String email) {
		contactUsEmail.sendKeys(email);
	}
	
	public void enterContactUsMessage(String message) {
		contactUsMessage.sendKeys(message);
	}
	
	public void clickOnSendButton(){
		sendMessage.click();
	}
	
	public void enterSearchQuery(String query){
		searchQuery.sendKeys(query);
	}
	
	public void submitSearchQuery(){
		submitSearchQuery.click();
	}
}
