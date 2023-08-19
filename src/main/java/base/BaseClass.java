package base;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

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

	public WebDriver navigateToBack() {
		driver.navigate().back();
		return driver;

	}

	public WebDriver navigateToForwad() {
		driver.navigate().forward();
		return driver;

	}

	public String getCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	private void quitBrowser() {
		driver.quit();

	}

	public WebDriver windowMinimize() {
		driver.manage().window().minimize();
		return driver;

	}

	public WebDriver windowMaximize() {
		driver.manage().window().maximize();
		return driver;

	}

	private WebDriver windowFullScreen() {
		driver.manage().window().fullscreen();
		return driver;

	}

	public WebDriver moveToElement(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.moveToElement(element).click().perform();

		return driver;

	}

	public WebDriver rightClick(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.contextClick(element).perform();

		return driver;

	}

	public WebDriver doubleClick(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.doubleClick(element).perform();

		return driver;

	}

	public Robot robotObject() throws AWTException {
		Robot robot = new Robot();
		return robot;

	}

	public void alertOK(WebDriver driver) {

		Alert al = driver.switchTo().alert();
		al.accept();

	}

	public void alertCanel(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.dismiss();

	}

	public void alertSendKeys(WebDriver driver, String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);

	}

}
