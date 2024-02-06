package MyPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.emirates.com");
										//1.  creating object of takescreenshot class
			// 2. Capture the screenshot.
			//3. save the screenshot into some location/folder
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Copy screenshot to a location
        FileUtils.copyFile(screenshotFile, new File("./screenshots/screenshot.png"));
   driver.quit();
	
	}
	}


