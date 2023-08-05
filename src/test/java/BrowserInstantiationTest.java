import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInstantiationTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(System.getProperty("user.dir"));
		
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.udemy.com/");
		
		Thread.sleep(10000);
		
		driver.close();
		



	}

}
