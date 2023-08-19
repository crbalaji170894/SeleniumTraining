package testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
//
//		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
//
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//
//		Thread.sleep(10000);
//
//		Alert al = driver.switchTo().alert();
//
//		al.accept();

//		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		
//		Alert al = driver.switchTo().alert();
//		
//		al.dismiss();
//		
//		//al.accept();
//		
//		WebElement confirmAlert = driver.findElement(By.xpath("//p[@id='demo']"));
//		
//		System.out.println(confirmAlert.getText());

		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		Alert al = driver.switchTo().alert();

		al.sendKeys("Hi Balaji");

		al.accept();
		
		//al.dismiss();

		WebElement promptAlert = driver.findElement(By.xpath("//p[@id='demo1']"));

		System.out.println(promptAlert.getText());

	}

}
