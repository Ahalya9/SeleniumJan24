package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFilling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ahalya");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Prashant");
		Select dropDown = new Select(driver.findElement(By.id("Skills")));//ClassName obj = new ClassName();
		dropDown.selectByValue("AutoCAD");
		dropDown.selectByVisibleText("Adobe Photoshop");
		dropDown.selectByIndex(4);
		Thread.sleep(3000);
		driver.get("https://demoqa.com/select-menu");
		Select multi = new Select(driver.findElement(By.name("cars")));
		multi.selectByValue("audi");
		multi.selectByIndex(0);
		multi.selectByVisibleText("Saab");
		multi.deselectByIndex(3);
		multi.deselectAll();
		Thread.sleep(3000);
		// Practice: date of birth section in the same page.
		
		driver.quit();
	}

}
