package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableTwo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://qavbox.github.io/demo/webtable/");

		List<WebElement> allRowsWebElemets = driver.findElements(By.xpath("(//table)[1]//tbody//tr"));

		for (WebElement eachRowWebElement : allRowsWebElemets) {
			List<WebElement> allTableDataWebElements = eachRowWebElement.findElements(By.tagName("td"));

			for (WebElement eachTableDataWebelement : allTableDataWebElements) {
				String eachTableText = eachTableDataWebelement.getText();

				if (eachTableText.equals("Selenium")) {

					for (WebElement seleniumRowWebElement : allTableDataWebElements) {
						System.out.println(seleniumRowWebElement.getText());

						if (seleniumRowWebElement.getText().equals("")) {
							seleniumRowWebElement.click();
						}
					}

				}

//				if (eachTableText.equals(""))
//
//				{
//					eachTableDataWebelement.click();
//				}

			}

		}
	}

}
