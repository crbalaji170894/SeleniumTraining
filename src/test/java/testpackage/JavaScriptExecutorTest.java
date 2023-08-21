package testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public void clickUsingJavaScriptExecutor() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi?%3CAuthentication");

		WebElement proceed = driver.findElement(By.xpath("//input[@name='proceed']"));

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting

		js.executeScript("arguments[0].click();", proceed);

		Thread.sleep(10000);

		Alert al = driver.switchTo().alert();

		al.accept();
	}

	public void scrollUpScrollDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://moneyboats.com/");

		WebElement elementZero = driver.findElement(By.xpath("//h3[text()='Archive']"));

		WebElement elementOne = driver.findElement(By.xpath("(//span[text()='Home'])[2]"));

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", elementZero);

		Thread.sleep(5000);

		js.executeAsyncScript("arguments[1].scrollIntoView(false);", elementZero, elementOne);

		Thread.sleep(5000);

	}

	public void setAndGetAttribute() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','test123@gmail.com');", username, password, login);

		js.executeScript("arguments[1].setAttribute('value','test@123A');", username, password, login);

		// js.executeScript("arguments[2].click();", username, password, login);

		String usernameValue = (String) js.executeScript("return arguments[0].getAttribute('value');", username,
				password, login);
		
		System.out.println(usernameValue);
		
		String passwordnameValue = (String) js.executeScript("return arguments[1].getAttribute('value');", username,
				password, login);
		
		System.out.println(passwordnameValue);
		
		String usernameClass = (String) js.executeScript("return arguments[0].getAttribute('class');", username,
				password, login);
		
		System.out.println(usernameClass);
		
		
	}

	public static void main(String[] args) throws InterruptedException {

		JavaScriptExecutorTest obj = new JavaScriptExecutorTest();

		// obj.clickUsingJavaScriptExecutor();

		// obj.scrollUpScrollDown();

		obj.setAndGetAttribute();

	}

}
