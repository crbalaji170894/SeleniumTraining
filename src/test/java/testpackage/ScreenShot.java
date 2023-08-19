package testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File sourceLocation = screenShot.getScreenshotAs(OutputType.FILE);

		File destinationLocation = new File(System.getProperty("user.dir") + "//screenshots//scr1.png");

		FileUtils.copyFile(sourceLocation, destinationLocation);

		driver.close();

	}
}
