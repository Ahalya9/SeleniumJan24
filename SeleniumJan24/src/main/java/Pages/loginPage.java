package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BasePage {
	
	//1. Page elements 2.  page actions 3. Page Factory in constructor
	//Thank you Team
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(id="user-name")
	private WebElement username;

	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	public void enterUsername(String txt_username) {
		enterText(username, txt_username);
	}

	public void enterPassword(String txt_password) {
		enterText(pwd,txt_password);
	}
	
	public void clickLogin() {
		Click(loginBtn);
	}
	

}
