package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://qavbox.github.io/demo/webtable/");

//		List<WebElement> totalNoOfTables = driver.findElements(By.tagName("table"));
//
//		System.out.println(totalNoOfTables.size());

		List<WebElement> allRowWebElements = driver.findElements(By.xpath("(//table)[2]//tbody//tr"));

		for (WebElement eachRowWebElement : allRowWebElements) {
			List<WebElement> allTdataWebElements = eachRowWebElement.findElements(By.tagName("td"));

			for (WebElement eachTdWebelemt : allTdataWebElements) {
				System.out.println(eachTdWebelemt.getText());
			}

		}

	}

}
