package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends BasePage {
	
	public productDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "inventory_details_price")
	private WebElement price;
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(className="shopping_cart_link")
	private WebElement shoppingCart;
	
	public String getPrice() {
		return getText(price);
	}
	
	public void clickAddToCart() {
		Click(addToCart);
	}
	
	public void clickShoppingCart() {
		Click(shoppingCart);
	}

}
