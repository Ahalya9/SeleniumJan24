package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage {   // 1. Elements 2. Actions 3. Page Factory in contructor

	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']") 
	private WebElement backPack;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	private WebElement bikeLight;
	
	// Rest 4 elements write it as an assignment
	
	public void clickBackPack() {
		Click(backPack);
	}
	
	public void clickBikeLight() {
	Click(bikeLight);
	}

}
