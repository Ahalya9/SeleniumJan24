package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class booleanOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.id("checkbox1")).isSelected();
		boolean visibility = driver.findElement(By.id("checkbox1")).isDisplayed();
		boolean enability = driver.findElement(By.id("checkbox2")).isEnabled();
		System.out.println(status);
		System.out.println(visibility);
		System.out.println(enability);
		driver.quit();
	}

}
