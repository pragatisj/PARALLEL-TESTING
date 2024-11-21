import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallerTesting2 {
	WebDriver driver=null;
	@Test
	public void pune() throws InterruptedException {
		System.out.println("from imple saudagar |"+Thread.currentThread().getId());
		System.out.println("Delhi | "+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	
	

}
