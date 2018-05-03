/**
 * 
 */
package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.CheckOutPage;
import page.MyStorePage;
import page.SearchPage;

/**
 * @author Ashvini
 *
 */
public class CheckoutTest {

	WebDriver driver = null;
	MyStorePage myStorePage = null;
	SearchPage searchPage = null;
	CheckOutPage checkOutPage = null;

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		String driverPath = System.getProperty("webdriver.gecko.driver");
		if (driverPath == null) {
			System.setProperty("webdriver.gecko.driver", "G:/geckodriver/geckodriver.exe");
		}
		driver = new FirefoxDriver();
		myStorePage = new MyStorePage(driver);
		searchPage = new SearchPage(driver);
		checkOutPage = new CheckOutPage(driver);
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@When("^he search for \"(.*)\"$")
	public void he_search_for_dress(String query) throws Throwable {
		myStorePage.enterSearchQuery(query);
		myStorePage.submitSearchQuery();
	}

	@And("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		searchPage.clickOnProduct();
	}

	@And("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
		checkOutPage.clickOnAddToCartBtn();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@class='btn btn-default button button-medium']"))).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@class='button btn btn-default standard-checkout button-medium']"))).click();		
	}

	@And("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page() throws Throwable {
		checkOutPage.enterEmailIdToReg("newuser@account.com");
		Thread.sleep(3000);		
		checkOutPage.enterPersonalDetails("firstname", "lastname", "address", "NY", "New York", "55555",
				"United States", "9876543210", "My Address","xyz123");
	}

	@And("^select same delivery address$")
	public void select_same_delivery_address() throws Throwable {
		checkOutPage.selectAddress();
		Thread.sleep(3000);
	}

	@And("^select payment method as cheque payment$")
	public void select_payment_method_as_cheque_payment() throws Throwable {
		checkOutPage.selectByCheque();
		Thread.sleep(3000);
	}

	@Then("^place the order$")
	public void place_the_order() throws Throwable {
		String successmessage = checkOutPage.confirmOrder();
		if (successmessage.equalsIgnoreCase("Your order on My Store is complete.")) {
			System.out.println("CheckOut Test Pass");
		} else {
			System.out.println("CheckOut Test Fail");
		}
	}

}
