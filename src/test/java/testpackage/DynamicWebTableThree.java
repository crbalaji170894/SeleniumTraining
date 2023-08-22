package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableThree {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.delta.com/");

		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[@id='input_departureDate_1']")).click();

		Thread.sleep(10000);

		List<WebElement> allRows = driver.findElements(By.xpath("(//table)[1]//tbody//tr"));

		for (WebElement eachRow : allRows) {
			List<WebElement> allTableData = eachRow.findElements(By.tagName("td"));

			for (WebElement eachData : allTableData) {
				String text = eachData.getText();

				if (text.equals("31")) {
					eachData.click();

					driver.findElement(By.xpath("//button[@class='donebutton']")).click();
					
					break;
					

				}
			}
		}

	}

}
