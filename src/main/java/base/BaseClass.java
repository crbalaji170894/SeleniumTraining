package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import constants.Constants;

public class BaseClass {

	WebDriver driver;

	public WebDriver launchChromeBrowser() {

		System.setProperty(Constants.chromeKey, Constants.projectPath + "//drivers//chromedriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public WebDriver launchFirefoxBrowser() {

		System.setProperty(Constants.firefoxKey, Constants.projectPath + "//drivers//geckodriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public WebDriver launchieBrowser() {

		System.setProperty(Constants.ieKey, Constants.projectPath + "//drivers//IEDriverServer.exe");

		driver = new InternetExplorerDriver();

		return driver;

	}

	public WebDriver getPage(String url) {

		driver.get(url);

		return driver;

	}

	public void closeBrowser() {
		driver.close();
	}
}
