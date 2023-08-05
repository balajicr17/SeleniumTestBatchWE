import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathString {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(10000);

		WebElement forgotPwd = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));

		forgotPwd.click();

		Thread.sleep(10000);

		driver.close();

	}

}
