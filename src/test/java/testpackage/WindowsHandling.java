package testpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://nxtgenaiacademy.com/multiplewindows/");

		

		//driver.findElement(By.xpath("//button[text()='New Tab']")).click();

		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();

		for (String eachWindowId : allWindowId) {
			if (!parentWindowId.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
				System.out.println(driver.getCurrentUrl());
				
			}
		}
		driver.switchTo().defaultContent();
		//String windowHandle = driver.getWindowHandle();
		//System.out.println(windowHandle);
		System.out.println(driver.getCurrentUrl());

	}

}
