import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInstantiation {

	public static void main(String[] args) {

		// provide the path driver files using set property method which are available
		// at System class is predefiend.

		// WebDirver interface which is predefined interface so that we can able to
		// access selenium methods using that we can able to automate web pages.

		// chrome

		// predefined class -> ChromeDriver class
		
//		System.out.println(System.getProperty("user.dir"));

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/downloads/");
		
		driver.close();

//		System.setProperty("webdriver.geko.driver",
//				"C:\\Users\\Kisho\\eclipse-workspace\\SeleniumTraining\\drivers\\geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();
//
//		driver.get("https://www.selenium.dev/downloads/");
//		
//		driver.close();

//		System.setProperty("webdriver.ie.driver",
//				"C:\\Users\\Kisho\\eclipse-workspace\\SeleniumTraining\\drivers\\IEDriverServer.exe");
//
//		WebDriver driver = new InternetExplorerDriver();
//
//		driver.get("https://www.selenium.dev/downloads/");
//
//		driver.close();

	}

}
