package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	WebDriver driver;

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginButton;

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPassword;

	@FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement createAnAccout;

	public FacebookLoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getCreateAnAccout() {
		return createAnAccout;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public void setForgotPassword(WebElement forgotPassword) {
		this.forgotPassword = forgotPassword;
	}

	public void setCreateAnAccout(WebElement createAnAccout) {
		this.createAnAccout = createAnAccout;
	}
}
