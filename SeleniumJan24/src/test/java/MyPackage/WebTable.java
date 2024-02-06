package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable extends precondition {
	
	@Test
	public void table() {
		driver.findElement(By.xpath("//table[@id='customers']"));
		System.out.println("Table is visible");
	}
	
	@Test
	public void TableHeaders() {
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Headers count: "+ headers.size());
		Assert.assertEquals(headers.size(), 3);
		boolean x = true;
		boolean y = false;
		Assert.assertNotEquals(x, y);
		Assert.assertEquals("Hello", "hello");
	}

	@Test
	public void TableData() throws InterruptedException {
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']//td"));
		System.out.println("data count: "+ data.size());
		System.out.println(data.get(0).getText());
		System.out.println(data.get(1).getText());
		// advanced for loop: syntax: for(dataType variableName: listofItems)
		String entry = "";
		for(WebElement e: data) { // 18 times
			entry = e.getText();
			Thread.sleep(500);
			if(entry.equals("Canada")) {
				Assert.assertTrue(true);
			}else {
				Assert.assertFalse(false);
			}
		}
	}
	
	@Test
	public void TableRows_Count() {	
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Rows: "+ rows.size());
		Assert.assertEquals(rows.size(), 7);
	}
	
	
	
}
