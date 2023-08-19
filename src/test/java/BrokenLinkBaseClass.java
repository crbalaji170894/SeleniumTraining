import org.openqa.selenium.WebDriver;

import base.BaseClass;
import constants.Constants;

public class BrokenLinkBaseClass {

	BaseClass baseClass = new BaseClass();

	public void brokenLinkTest() throws InterruptedException {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.brokenLink);

		baseClass.brokenLink(page);
		
		Thread.sleep(10000);

		baseClass.closeBrowser(page);

	}

	public static void main(String[] args) throws InterruptedException {

		BrokenLinkBaseClass obj = new BrokenLinkBaseClass();

		obj.brokenLinkTest();
	}

}
