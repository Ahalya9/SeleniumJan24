package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		// Actions class: mouse Actions(left click, right click, scrolling, double click)
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//a[text()='Home']"))).perform();
		driver.get("https://demoqa.com/droppable");
		WebElement start = driver.findElement(By.id("draggable"));
		WebElement end = driver.findElement(By.id("droppable"));
		act.dragAndDrop(start, end).perform();
		act.contextClick().perform();  // double click
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
		WebElement yt = driver.findElement(By.xpath("//a[text()='Youtube']"));
		act.moveToElement(video).moveToElement(yt).click().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
