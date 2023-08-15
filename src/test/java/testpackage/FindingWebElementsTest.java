package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingWebElementsTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));

		username.sendKeys("test123@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys("test@123A");

		WebElement login = driver.findElement(By.name("login"));

		login.click();
		
		Thread.sleep(20000);

		driver.close();

		
	}

}
