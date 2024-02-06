package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {     // This is Base Page 
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
		
	public void waitForVisiblity(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(e));	
	}
	
	public void waitForInVisibility(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.invisibilityOf(e));	
	}
	
	public void Click(WebElement e) {
		waitForVisiblity(e);
		e.click();
	}
	
	public void clearText(WebElement e) {
		waitForVisiblity(e);
		e.clear();
	}
	
	public void enterText(WebElement e, String text) {
		waitForVisiblity(e);
		e.sendKeys(text);
	}
	public String getText(WebElement e) {
		return e.getText();
	}
	public void selectByIndex(WebElement e, int x) {
		waitForVisiblity(e);
		Select select = new Select(e);
		select.selectByIndex(x);
	}
}
