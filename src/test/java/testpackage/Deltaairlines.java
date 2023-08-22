package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deltaairlines {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.delta.com/apac/en");

		WebElement fromSearch = driver.findElement(By.xpath("(//span[@class='airport-code d-block'])[1]"));

		fromSearch.sendKeys("MAA");

		Robot robot = new Robot();

//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

//		WebElement toSearch = driver.findElement(By.xpath("//span[text()='To']"));
//
//		toSearch.click();
//
//		WebElement destinationCity = driver.findElement(By.xpath("//input[@id='search_input']"));
//
//		destinationCity.sendKeys("DEL");
//
////		WebElement understand=driver.findElement(By.xpath("//button[@class='btn btn-secondary-cta']"));
////		
////		JavascriptExecutor js =(JavascriptExecutor)driver;
////		
////		js.executeScript("arguments[0].click();", understand);
//
//		Robot robot = new Robot();
//
////		robot.keyPress(KeyEvent.VK_DOWN);
////		robot.keyRelease(KeyEvent.VK_DOWN);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
