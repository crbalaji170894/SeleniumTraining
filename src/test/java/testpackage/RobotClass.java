package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));

		username.sendKeys("crbalaji17@gmail.com");
		
		BaseClass baseClass = new BaseClass();
		
		//Robot robot = new Robot();

		baseClass.robotObject().keyPress(KeyEvent.VK_TAB);

		baseClass.robotObject().keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(5000);

		baseClass.robotObject().keyPress(KeyEvent.VK_ENTER);

		baseClass.robotObject().keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		baseClass.robotObject().keyPress(KeyEvent.VK_TAB);

		baseClass.robotObject().keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(5000);

		baseClass.robotObject().keyPress(KeyEvent.VK_ENTER);

		baseClass.robotObject().keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

	}

}
