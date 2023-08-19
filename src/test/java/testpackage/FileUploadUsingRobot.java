package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://easyupload.io/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='dz-button']")).click();

		StringSelection filePath = new StringSelection(
				"C:\\Users\\Kisho\\eclipse-workspace\\SeleniumTraining\\screenshots\\scr1.png");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		Thread.sleep(10000);

		Robot robot = new Robot();

		robot.delay(250);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[@id='upload']")).click();

		Thread.sleep(10000);

	}

}
