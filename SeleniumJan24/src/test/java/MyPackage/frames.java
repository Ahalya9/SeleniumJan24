package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class frames {

	@Test(priority=1, invocationCount=1, timeOut=20000, enabled = true)
	public void SingleFrame() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
		driver.quit();	
	}
	
	@Test(priority=1)
	public void empty() {
		System.out.println("Empty.....");
	}
		
	@Test(priority=2,dependsOnMethods= {"empty"}, description= "This is related to new software release")
	public void MultiFrame() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement multi = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multi);
		WebElement nested = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(nested);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
		driver.quit();
	}
	
	
}
