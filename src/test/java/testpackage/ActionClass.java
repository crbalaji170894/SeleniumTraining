package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public void moveToelement() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement messenger = driver.findElement(By.xpath("//a[text()='Messenger']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(messenger).click().perform();

		Thread.sleep(10000);

	}

	public void contextClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement forgotpwd = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));

		Actions acc = new Actions(driver);

		acc.contextClick(forgotpwd).perform();

		Thread.sleep(10000);

	}

	public void doubleClick() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));

		Actions acc = new Actions(driver);

		acc.doubleClick(doubleclick).perform();

		WebElement message = driver.findElement(By.xpath("//p[text()='You have done a double click']"));

		if (message.isDisplayed() == true) {
			System.out.println("Double Successfull done");
		}

	}

	public void dargAndDrop() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/drag_and_drop");

		WebElement w1 = driver.findElement(By.xpath("//div[@id='column-a']"));

		WebElement w2 = driver.findElement(By.xpath("//div[@id='column-b']"));

		Thread.sleep(10000);

		Actions acc = new Actions(driver);

		acc.dragAndDrop(w1, w2).perform();
	}

	public static void main(String[] args) throws InterruptedException {

		ActionClass obj = new ActionClass();

		// obj.moveToelement();

		// obj.contextClick();
		// obj.doubleClick();

		obj.dargAndDrop();
	}

}
