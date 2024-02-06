package MyPackage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//button[contains(text(),'click')]")).click(); 
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // Switch to the desired tab
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.quit();   // Practice: https://demoqa.com/browser-windows
	}

}
