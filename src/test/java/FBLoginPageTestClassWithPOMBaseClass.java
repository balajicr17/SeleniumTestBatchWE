
import org.base.BaseClass;
import org.constants.URLConstants;
import org.openqa.selenium.WebDriver;

import pages.FacebookLoginPage;

public class FBLoginPageTestClassWithPOMBaseClass {

	BaseClass baseclass = new BaseClass();

	public void launchFBPageAndSendInvalidCredentials() throws InterruptedException {

		baseclass.chromeBrowserInstantiation();

		WebDriver page = baseclass.getPage(URLConstants.fbURL);

		FacebookLoginPage fbPage = new FacebookLoginPage(page);

		fbPage.getUsername().sendKeys("xyz@gmail.com");

		fbPage.getPassword().sendKeys("test@123A");

		fbPage.getLoginButton().click();

		Thread.sleep(10000);

		baseclass.close();

	}

	private void ciclkForgotPwd() throws InterruptedException {

		baseclass.chromeBrowserInstantiation();

		WebDriver page = baseclass.getPage(URLConstants.fbURL);

		FacebookLoginPage fbPage = new FacebookLoginPage(page);

		fbPage.getForgotPassword().click();

		Thread.sleep(10000);

		baseclass.close();

	}

	public static void main(String[] args) throws InterruptedException {
		FBLoginPageTestClassWithPOMBaseClass obj = new FBLoginPageTestClassWithPOMBaseClass();

		//obj.launchFBPageAndSendInvalidCredentials();
		
		obj.ciclkForgotPwd();

	}

}
