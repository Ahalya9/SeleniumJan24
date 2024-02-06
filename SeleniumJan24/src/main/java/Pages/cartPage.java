package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends BasePage{
	
	// 1. page elements 2. page actions 3. page factory
	
	public cartPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement remove;
	
	@FindBy(id="continue-shopping")
	private WebElement cont;
	
	@FindBy(name="checkout")
	private WebElement checkout;
	
	public void removeItem() {
		Click(remove);
	}
	
	public void contShopping() {
		Click(cont);
	}
	
	public void clickCheckout() {
		Click(checkout);
	}
	
	

}
