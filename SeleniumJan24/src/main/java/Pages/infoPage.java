package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends BasePage {
	
	public infoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="first-name")
	private WebElement fName;
	
	
	@FindBy(id="last-name")
	private WebElement lName;
	
	
	@FindBy(id="postal-code")
	private WebElement zipCode;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	public void enterDetails(String fname, String lname, String zipcode) {
		enterText(fName, fname);
		enterText(lName, lname);
		enterText(zipCode, zipcode);
		Click(cont);
	}

}
