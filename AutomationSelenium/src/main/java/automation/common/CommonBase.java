package automation.common;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TimeoutException;

public class CommonBase {
	 public  static WebDriver driver;
	 private int pageLoadTimeout = 40;
	 
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
	public WebElement getELementPresentDOM (By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(pageLoadTimeout));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}
	public void click(By locator)
	{
		WebElement element = getELementPresentDOM(locator);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(pageLoadTimeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	public void type(By locator, String value)
	{
		WebElement element = getELementPresentDOM(locator);
		element.clear();
		element.sendKeys(value);
	}
	
	public boolean isElementDisplay(By locator)
	{
		try {
		WebElement element = getELementPresentDOM(locator);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(pageLoadTimeout));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
		catch (NoSuchElementException ex1) 
		{
			return false;
		}
		catch (TimeoutException ex2)
		{
			return false;
		}
	}
	//Các hàm dùng javascripts
	public void type_toElementByValueAttribute(By locator, String value)
	{
		try {
		WebElement element = getELementPresentDOM(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[®].value = '" + value + "'", element);
	}
		catch(StaleElementReferenceException ex)
		{ 
		type_toElementByValueAttribute(locator, value);
		}
	}
		public void scrollToElement (By locator) {
		WebElement element = getELementPresentDOM(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
		public void clickJavaScript(By locator)
		{
			WebElement element = getELementPresentDOM(locator);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		}
		
		private  WebDriver initBrowser()
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
		}
		
		private WebDriver initFireFoxDriver() 
		{
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\driver\\geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			return driver;
		}
		private WebDriver initMSEdgeDriver() 
		{
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\driver\\geckodriver");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			return driver;
		}
		
		public WebDriver setupDriver(String browserName)
		{
			switch(browserName.trim().toLowerCase()) {
			case "chrome":
				System.out.println("Initializing chrome browser test...");
				driver = initBrowser();
				break;
			case "firefox":
				System.out.println("Initializing firefox browser test...");
				driver = initFireFoxDriver();
				break;
			case "edge":
				System.out.println("Initializing MS edge browser test...");
				driver = initMSEdgeDriver();
				break;
			default:
				System.out.println("Invalid broswer test, choose chrome as default of choice....");
				driver = initBrowser();
				break;
				}
				return driver;
			}
		}
	

