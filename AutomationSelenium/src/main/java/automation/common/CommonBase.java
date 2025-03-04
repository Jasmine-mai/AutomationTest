package automation.common;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonBase {
	 public WebDriver driver;
	public  WebDriver initBrowser(String URL)
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public WebDriver initFireFoxDriver(String URL) {
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\driver\\geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
	}
}
