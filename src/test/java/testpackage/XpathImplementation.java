package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathImplementation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		username.sendKeys("test123321@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

		password.sendKeys("test@123A");

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));

		login.click();

		Thread.sleep(20000);
		
		driver.close();
//
//		driver.navigate().back();
//		
//		WebElement username1 = driver.findElement(By.xpath("//input[@id='email']"));
//
//		username1.sendKeys("test@gamil.com");

	}

}
