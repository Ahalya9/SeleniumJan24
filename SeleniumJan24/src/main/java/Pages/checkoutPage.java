package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutPage extends BasePage {
	
	public checkoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="finish")
	private WebElement finish;
	
	
	public void clickFinish() {
		Click(finish);
	}

}
