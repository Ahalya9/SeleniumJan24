package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class InprivateWindow {

	public static void main(String[] args) {
		//EdgeOptions options = new EdgeOptions();
		//options.addArguments("--inprivate");
		//WebDriver driver = new EdgeDriver(options);
		ChromeOptions chrome_options = new  ChromeOptions();
		chrome_options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(chrome_options);
		driver.get("https://www.google.com");
		driver.quit();	    // Practice Try with Firefox Browser
	}
}
