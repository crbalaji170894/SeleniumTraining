import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import constants.Constants;
import page.UploadFilePage;

public class FileUploadUsingRobotWithBaseClass {

	BaseClass baseClass = new BaseClass();

	public void uploadFile() throws InterruptedException, AWTException {
		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.uploadFilePage);

		Thread.sleep(10000);

		UploadFilePage uploadPage = new UploadFilePage(page);

		uploadPage.getClickToSelectFile().click();

		baseClass.uploadFileUsingRobotClass(
				"C:\\Users\\Kisho\\eclipse-workspace\\SeleniumTraining\\screenshots\\scr1.png");

		uploadPage.getUploadButton().click();

		Thread.sleep(15000);

		System.out.println(baseClass.getCurrentURL());

	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		FileUploadUsingRobotWithBaseClass obj = new FileUploadUsingRobotWithBaseClass();

		obj.uploadFile();

	}

}
