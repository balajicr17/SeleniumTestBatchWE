import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		Thread.sleep(10000);

		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		username.sendKeys("emailid@gamil.com");

		Thread.sleep(10000);

		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

		password.sendKeys("test@123A");

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));

		login.click();

		Thread.sleep(10000);

		driver.close();
	}

}
