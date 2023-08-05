import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
//		
//		WebElement linkedText = driver.findElement(By.linkText("Gmail"));
//		
//		linkedText.click();
		
		WebElement partialText = driver.findElement(By.partialLinkText("Gm"));
		
		partialText.click();
	}

}
