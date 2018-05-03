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
public class SearchPage {
	
	public SearchPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "selectProductSort") 
	private WebElement sortingOption;
	
	@FindBy(how = How.CLASS_NAME, using = "available-now") 
	private WebElement inStock;
	
	@FindBy(how = How.XPATH, using = ".//*[@title='Blouse'][@class='product-name']")
	private WebElement clickOnProduct;
	
	@FindBy(how = How.XPATH, using = ".//*[@title='Proceed to checkout']") 
	private WebElement proceedtocheckout;
		
	
	public void enterSortingOption(String option){
		sortingOption.sendKeys(option);
	}
	
	public boolean isInStock(){
		return inStock.isDisplayed();
	}
	
	public void clickOnProduct(){
		clickOnProduct.click();
	}

}
