package testpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, MalformedURLException {

		int brokenCount =0;
		int validCount =0;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/broken");

		List<WebElement> allURL = driver.findElements(By.tagName("a"));

		for (WebElement eachURL : allURL) {

			String hrefurl = eachURL.getAttribute("href");

			try {
				URL url = new URL(hrefurl);

				HttpURLConnection connection = (HttpURLConnection) url.openConnection();

				connection.setConnectTimeout(5000);

				connection.connect();

				if (connection.getResponseCode() >= 400) {
					System.out.println(connection.getResponseMessage());
					System.out.println(hrefurl + " is  broken Link");
					brokenCount++;
					
				} else {
					System.out.println(connection.getResponseMessage());
					System.out.println(hrefurl + " is not broken Link");
					validCount++;
				}

			} catch (Exception e) {
				System.out.println(e);
			}
			

		}
		
		System.out.println(brokenCount);
		System.out.println(validCount);

	}
}
