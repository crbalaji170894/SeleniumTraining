package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		//WebElement gmailURL = driver.findElement(By.linkText("Gmail"));
		
		WebElement gmailURL = driver.findElement(By.partialLinkText("Gm"));

		gmailURL.click();

	}
}
