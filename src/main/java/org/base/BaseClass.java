package org.base;

import org.constants.URLConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	WebDriver driver;

	public WebDriver chromeBrowserInstantiation() {

		System.setProperty(URLConstants.chromeDriver, URLConstants.projectPath + "\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public WebDriver fireFoxBrowserInstantiation() {

		System.setProperty(URLConstants.ffDriver, URLConstants.projectPath + "\\drivers\\\\geckodriver.exe");

		driver = new FirefoxDriver();

		return driver;

	}
	public void getPage(String url) {
		driver.get(url);

	}

	public void close() {
		driver.close();
	}

}
