import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import constants.Constants;
import page.DoubleClickSamplePage;
import page.FaceBookLogin;

public class ActionClassBaseClass {

	BaseClass baseClass = new BaseClass();

	public void moveToEelement() throws InterruptedException {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin loginPage = new FaceBookLogin(page);

		baseClass.moveToElement(page, loginPage.getMessenger());

		Thread.sleep(10000);

		baseClass.closeBrowser();

	}

	public void rightClick() throws InterruptedException {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin loginPage = new FaceBookLogin(page);

		baseClass.rightClick(page, loginPage.getForgotpwd());

		Thread.sleep(10000);

		baseClass.closeBrowser();

	}

	public void doubleClick() throws InterruptedException {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.doubleClickSampleSite);

		Thread.sleep(10000);

		DoubleClickSamplePage doubleClickpage = new DoubleClickSamplePage(page);

		baseClass.doubleClick(page, doubleClickpage.getDoubleClickButton());

//		Thread.sleep(10000);
//
//		WebElement message = page.findElement(By.xpath("//p[text()='You have done a double click']"));
//
//		if (message.isDisplayed() == true) {
//			System.out.println("Successfully done double click");
//		}

		baseClass.closeBrowser();
	}

	public static void main(String[] args) throws InterruptedException {

		ActionClassBaseClass obj = new ActionClassBaseClass();

		// obj.moveToEelement();

		// obj.rightClick();

		//obj.doubleClick();

	}
}
