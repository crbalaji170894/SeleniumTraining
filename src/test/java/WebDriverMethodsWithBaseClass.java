
import org.testng.Assert;


import base.BaseClass;
import constants.Constants;

public class WebDriverMethodsWithBaseClass {

	BaseClass baseClass = new BaseClass();
	
	
	
	public void urlAndTitle() {

		baseClass.launchChromeBrowser();

		baseClass.getPage(Constants.fbPage);

		String autcalURL = baseClass.getCurrentURL();

		Assert.assertEquals(autcalURL, "https://www.facebook.com/");
		
		String actualTitle = baseClass.getTitle();

	}
	
	

	public static void main(String[] args) {
		WebDriverMethodsWithBaseClass obj = new WebDriverMethodsWithBaseClass();

		obj.urlAndTitle();
	}
}
