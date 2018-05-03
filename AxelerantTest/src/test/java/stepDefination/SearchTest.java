/**
 * 
 */
package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MyStorePage;
import page.SearchPage;

/**
 * @author Ashvini
 *
 */
public class SearchTest {
	
	WebDriver driver = null; 
	MyStorePage myStorePage = null;
	SearchPage searchPage = null;
	
	@Given("^I am on MyStore page$")
	public void i_am_on_MyStore_page() throws Throwable {
		String driverPath = System.getProperty("webdriver.gecko.driver");
		if (driverPath == null) {
			System.setProperty("webdriver.gecko.driver", "G:/geckodriver/geckodriver.exe");
		} 
	    driver = new FirefoxDriver(); 
	    myStorePage = new MyStorePage(driver);
	    searchPage = new SearchPage(driver);
	    driver.navigate().to("http://automationpractice.com/index.php");
	}

	@When("^I enter serach query \"([^\"]*)\"$")
	public void i_enter_serach_query(String query) throws Throwable {
		myStorePage.enterSearchQuery(query);
	}

	@And("^I click on searchbutton$")
	public void i_click_on_searchbutton() throws Throwable {
		myStorePage.submitSearchQuery();
	}

	@And("^I choose option \"([^\"]*)\"$")
	public void i_choose_option(String option) throws Throwable {
		searchPage.enterSortingOption(option);
	}

	@Then("^I check for In stock option in search result$")
	public void i_check_for_In_stock_option_in_search_result() throws Throwable {
		if(searchPage.isInStock()) {
			System.out.println("Search Test Pass");
		} else {
			System.out.println("Search Test Fail");
		}
	}

}
