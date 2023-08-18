package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassKeyBoard {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		Actions actions = new Actions(driver);

		actions.sendKeys(username, "test123@gmail.com").perform();

		//Thread.sleep(10000);

		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER)
				.keyUp(Keys.ENTER).perform();
		
		
		//actions.keyDown(Keys.SHIFT).sendKeys(username, "abchfgklf").keyUp(Keys.SHIFT).perform();

	}

}
