package SecondPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	WebDriver driver;
	
	
	@Parameters({"url", "time"})
	@BeforeTest
	public void before(String url, int time) {
		 driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	@AfterTest
	public void After() {
		driver.quit();
	}
	
	@Parameters({"username", "pwd"})
	@Test
	public void login(String username, String pwd) {
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login-button")).click();
	}	
	
}
