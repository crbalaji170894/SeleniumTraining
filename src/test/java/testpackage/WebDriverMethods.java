package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.get("https://www.facebook.com/");

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

		String title = driver.getTitle();

		System.out.println(title);

		// driver.manage().window().fullscreen();

//		driver.manage().window().maximize();
//
//		driver.manage().window().minimize();
//
//		Thread.sleep(10000);
//
//		driver.manage().window().maximize();

		
		driver.navigate().back();
		
		String currentUrl1 = driver.getCurrentUrl();

		System.out.println(currentUrl1);

		String title1 = driver.getTitle();

		System.out.println(title1);
		
		driver.navigate().forward();
	
		
	}

}
