package MyPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.id("OKTab")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();  //Simple Alert
		WebElement cancel = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		cancel.click();
		driver.findElement(By.id("CancelTab")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();  // Confirmation Alert
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Textbox")).click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Selenium weekdays batch");
		al.accept();
		
		Thread.sleep(3000);
		driver.quit();
		
		// Practice: https://demoqa.com/alerts
		
	}

}
