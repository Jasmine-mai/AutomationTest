package automation.testsuite;
import static org.testng.AssertJUnit.assertEquals;
import automation.common.CommonBase;

import automation.constant.CT_PageURL;
import automation.pageLocator.LoginPage;
import dev.failsafe.internal.util.Assert;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HomeWork_day13 extends CommonBase {
	@BeforeMethod
	public void OpenBrowser()
	{		
		driver = initFireFoxDriver(CT_PageURL.URL_CRMSTAR);
	}
	
	@Test
	public void loginSuccessfully()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@gmail.com", "12345678");
		//Assert Dashboard display
		assertTrue(driver.findElement(By.xpath("//input[@type='text']")).isDisplayed());
	}
	
	@Test
	public void loginFail_IncorrectEmail() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin1@gmail.com", "12345678");
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds (10) ) ;
		WebElement errorMessage = wait.until (ExpectedConditions.visibilityOfElementLocated(
		By.xpath("//span[@class='fl-message' and contains(text (), 'Tài khoản của bạn tạm thời không hoạt động')]"))) ;
		assertTrue (errorMessage.isDisplayed()) ;
    }
	
	
	@Test
	public void loginFail_IncorrectPassword() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@gmail.com", "1234567fdkfjkd8");
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds (10) ) ;
		WebElement errorMessage = wait.until (ExpectedConditions.visibilityOfElementLocated(
		By.xpath("//span[@class='fl-message' and contains(text (), 'Email hoặc mật khẩu không đúng')]"))) ;
		assertTrue (errorMessage.isDisplayed()) ;
    }

	
	@Test
	public void loginFail_Incorrect_Email_Password() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin1@gmail.com", "123456jfkdjfkd78");
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds (10) ) ;
		WebElement errorMessage = wait.until (ExpectedConditions.visibilityOfElementLocated(
		By.xpath("//span[@class='fl-message' and contains(text (), 'Email hoặc mật khẩu không đúng')]"))) ;
		assertTrue (errorMessage.isDisplayed()) ;
    }

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
