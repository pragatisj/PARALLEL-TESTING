import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallerTesting3 {
	
	@Test
	public void solapur() {
		
	}
	
	@Test(threadPoolSize=3, invocationCount=4, timeOut=1000)
	public void mumbai() throws InterruptedException {
		System.out.println("I am pragati| "+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipcard.in");
		Thread.sleep(3000);
		
	}

}
