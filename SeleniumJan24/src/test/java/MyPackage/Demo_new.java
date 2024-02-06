package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_new {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); //
		driver.manage().window().maximize();
		driver.get("https://www.emirates.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
