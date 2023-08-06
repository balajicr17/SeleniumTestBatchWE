import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookLoginPage;

public class FBLoginPageTestClassWithPOM {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com//");

		Thread.sleep(10000);

		FacebookLoginPage fbPage = new FacebookLoginPage(driver);

		WebElement username = fbPage.getUsername();

		username.sendKeys("xyz@gmail.com");

		Thread.sleep(5000);

		fbPage.getPassword().sendKeys("passwrod@123A");

		Thread.sleep(5000);

		fbPage.getLoginButton().click();

		Thread.sleep(5000);

		driver.close();

	}

}
