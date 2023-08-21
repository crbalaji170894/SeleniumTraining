package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrmaesTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");

		List<WebElement> allIfrmaes = driver.findElements(By.tagName("iframe"));

//		for (WebElement eachifrmae : allIfrmaes) {
//		System.out.println(eachifrmae.getAttribute("id"));
//			
////			driver.switchTo().frame(eachifrmae);//WebElement
////			
////			System.out.println("Frmae switched");
////			
////			driver.switchTo().parentFrame();
//		}

//		for (int i = 0; i < allIfrmaes.size(); i++) {
//			driver.switchTo().frame(i);//index
//			System.out.println("Frmae switched");
//			driver.switchTo().parentFrame();
//		}

		driver.switchTo().frame("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0");
		System.out.println("Frames Switched");

	}

}
