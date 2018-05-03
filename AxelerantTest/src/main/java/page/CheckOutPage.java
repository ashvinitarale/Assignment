/**
 * 
 */
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Ashvini
 *
 */
public class CheckOutPage {
	WebDriver webDriver;
	public CheckOutPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	    webDriver = driver;
	}
	
	@FindBy(how = How.ID, using = "add_to_cart") 
	private WebElement addtocartbtn;
	
	@FindBy(how = How.XPATH, using = ".//*[@title='Proceed to checkout']") 
	private WebElement proceedtocheckout;
	
	@FindBy(how = How.ID, using = "email_create")
	private WebElement createemail;
	
	@FindBy(how = How.ID, using = "SubmitCreate")
	private WebElement SubmitCreateAccount;
	
	@FindBy(how = How.ID, using = "id_gender2")
	private WebElement mrs;
	
	@FindBy(how = How.ID, using = "customer_firstname")
	private WebElement firtname;
	
	@FindBy(how = How.ID, using = "customer_lastname")
	private WebElement lastname;
	
	@FindBy(how = How.ID, using = "email")
	private WebElement email;
	
	@FindBy(how = How.ID, using = "passwd")
	private WebElement password;
	
	@FindBy(how = How.ID, using = "firstname")
	private WebElement add_firstname;
	
	@FindBy(how = How.ID, using = "lastname")
	private WebElement add_lastname;
	
	@FindBy(how = How.ID, using = "address1")
	private WebElement address1;
	
	@FindBy(how = How.ID, using = "city")
	private WebElement city;
	
	@FindBy(how = How.ID, using = "id_state")
	private WebElement state;
	
	@FindBy(how = How.ID, using = "postcode")
	private WebElement zipcode;
	
	@FindBy(how = How.ID, using = "id_country")
	private WebElement country;
	
	@FindBy(how = How.ID, using = "phone_mobile")
	private WebElement mobile;
	
	@FindBy(how = How.ID, using = "alias")
	private WebElement alias;
	
	@FindBy(how = How.ID, using = "submitAccount")
	private WebElement Register;
	
	@FindBy(how = How.NAME, using = "processAddress")
	private WebElement processAddress;
	
	@FindBy(how = How.ID, using = "cgv")
	private WebElement terms;
	
	@FindBy(how = How.NAME, using = "processCarrier")
	private WebElement processCarrier;
	
	@FindBy(how = How.CLASS_NAME, using = "cheque")
	private WebElement Bycheque;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='button btn btn-default button-medium']")
	private WebElement confirmorder;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='alert alert-success']")
	private WebElement orderCompleteMsg;
	
	@FindBy(how = How.XPATH, using = ".//*[@title='Proceed to checkout']") 
	private WebElement proceedtocheckoutbtn;
	
	public void clickOnAddToCartBtn() {
		addtocartbtn.click();		
	}
	
	public void enterEmailIdToReg(String regEmail) {
		createemail.sendKeys(regEmail);
		SubmitCreateAccount.click();
	}
	
	public void enterPersonalDetails(String fn,String ln, String add, String cy, String st, String postcode, String ctry, String mbile, String altadd,String pw) {
		mrs.click();
		firtname.sendKeys(fn);
		lastname.sendKeys(ln);
		password.sendKeys(pw);
		address1.sendKeys(add);
		city.sendKeys(cy);
		state.sendKeys(st);
		zipcode.sendKeys(postcode);
		country.sendKeys(ctry);
		mobile.sendKeys(mbile);
		alias.sendKeys(altadd);
		Register.click();
	}
	
	public void selectAddress() {
		processAddress.click();
		terms.click();
		processCarrier.click();		
	}
	
	public void selectByCheque() {
		Bycheque.click();
	}
	
	public String confirmOrder() {
		confirmorder.click();
		return orderCompleteMsg.getText();
	}
}
