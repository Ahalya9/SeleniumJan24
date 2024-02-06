package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class findElements {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); //Open the browser
		driver.get("https://www.saucedemo.com");
		driver.findElements(By.xpath("//input[@autocapitalize='none']"));
System.out.println("here...");
		driver.quit();
		
		

	}

}
