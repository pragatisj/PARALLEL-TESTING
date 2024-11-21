import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallerTest1 {
	
	@Test
	public void Delhi() throws InterruptedException {
		System.out.println("Delhi | "+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
	}

}
