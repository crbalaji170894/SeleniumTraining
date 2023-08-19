import org.openqa.selenium.WebDriver;

import base.BaseClass;
import constants.Constants;

public class BaseclassImplementation {

	BaseClass baseClass = new BaseClass();

	public void testCaseOne_GetSeleniumPage() throws InterruptedException {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.seleniumPage);

		Thread.sleep(5000);

		baseClass.closeBrowser(page);

	}

	public void testCaseTwo_GetSeleniumPageusingFirefox() throws InterruptedException {

		baseClass.launchFirefoxBrowser();

		WebDriver page = baseClass.getPage(Constants.fbPage);

		Thread.sleep(5000);

		baseClass.closeBrowser(page);

	}

	public void testCaseThree_UsingIE() throws InterruptedException {
		baseClass.launchieBrowser();

		WebDriver page = baseClass.getPage(Constants.seleniumPage);

		Thread.sleep(5000);

		baseClass.closeBrowser(page);

	}

	public static void main(String[] args) throws InterruptedException {

		BaseclassImplementation obj = new BaseclassImplementation();

		obj.testCaseOne_GetSeleniumPage();

		obj.testCaseTwo_GetSeleniumPageusingFirefox();

		obj.testCaseThree_UsingIE();

	}

}
