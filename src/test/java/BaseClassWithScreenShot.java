import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import constants.Constants;

public class BaseClassWithScreenShot {

	BaseClass baseClass = new BaseClass();

	public void takeScreenShot() throws IOException {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.alertSite);

		baseClass.screenShot(page);

	}

	public static void main(String[] args) throws IOException {
		BaseClassWithScreenShot obj = new BaseClassWithScreenShot();

		obj.takeScreenShot();

	}

}
