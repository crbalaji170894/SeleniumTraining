import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import constants.Constants;
import page.FaceBookLogin;

public class FBLoginPageWithIPOM {

	BaseClass baseClass = new BaseClass();

	public void tc_One_InvalidUsernameAndInvalidPwd() throws InterruptedException {

		baseClass.launchChromeBrowser();

		WebDriver fbpage = baseClass.getPage(Constants.fbPage);

		FaceBookLogin page = new FaceBookLogin(fbpage);

		WebElement username = page.getUsername();

		username.sendKeys("test123321@gmail.com");

		page.getPassword().sendKeys("test@123A");

		page.getLoginButton().click();

		Thread.sleep(10000);

		baseClass.navigateToBack();

		username.clear();
		
		Thread.sleep(10000);

		username.sendKeys("test@gmail.com");

	}

	public static void main(String[] args) throws InterruptedException {

		FBLoginPageWithIPOM obj = new FBLoginPageWithIPOM();

		obj.tc_One_InvalidUsernameAndInvalidPwd();

	}
}
