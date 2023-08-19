import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import constants.Constants;
import page.AlertSamplepage;

public class AlertWithBaseClass {

	BaseClass baseClass = new BaseClass();

	public void simpleAlert() throws InterruptedException {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.alertSite);

		AlertSamplepage alertPage = new AlertSamplepage(page);

		alertPage.getAlertOK().click();

		alertPage.getClickSimpleAlert().click();

		Thread.sleep(10000);

		baseClass.alertOK(page);

	}

	public void confirmAlert() {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.alertSite);

		AlertSamplepage alertPage = new AlertSamplepage(page);

		alertPage.getAlertOKAndCancel().click();

		alertPage.getClickConfirmAlert().click();
//
//		baseClass.alertOK(page);

		baseClass.alertCanel(page);

		WebElement messageConfirmAlert = alertPage.getMessageConfirmAlert();

		System.out.println(messageConfirmAlert.getText());

	}

	public void promptAlert() {

		baseClass.launchChromeBrowser();

		WebDriver page = baseClass.getPage(Constants.alertSite);

		AlertSamplepage alertPage = new AlertSamplepage(page);

		alertPage.getAlertOKAndCancelWithText().click();

		alertPage.getClickPromptAlert().click();

		baseClass.alertSendKeys(page, "Hi Welcome");

		baseClass.alertOK(page);

		System.out.println(alertPage.getMessagePromptalert().getText());

	}

	public static void main(String[] args) throws InterruptedException {
		AlertWithBaseClass obj = new AlertWithBaseClass();

		// obj.simpleAlert();

		// obj.confirmAlert();

		obj.promptAlert();

	}

}
