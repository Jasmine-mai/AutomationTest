package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day14_BTVN_ALADA_Page;

public class Day14_BTVN_ALADA_Test extends CommonBase {
	@BeforeMethod
	public void OpenBrowser()
	{		
		driver = initFireFoxDriver(CT_PageURL.URL_ALADA_SIGNUP);
	}
	
	@Test(priority=1)
	public void SignupSuccessfully()
	{
		Day14_BTVN_ALADA_Page signup = new Day14_BTVN_ALADA_Page(driver);
		signup.SignupFunction("Dung Mai", "maidung180699+6@gmail.com", "maidung180699+6@gmail.com", "123456", "123456", "0355643789");
		//assertTrue(driver.findElement(By.xpath("//div[@class='login']/child::a[text()='Khóa học của tôi']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//input[@id='txtSearch']")).isDisplayed());
	}
	
	@Test(priority=2)
	public void EditPasswordFunction()
	{
		Day14_BTVN_ALADA_Page signup = new Day14_BTVN_ALADA_Page(driver);
		signup.SignupFunction("Dung Mai", "maidung180699+11@gmail.com", "maidung180699+11@gmail.com", "123456", "123456", "0355643789");
		assertTrue(driver.findElement(By.xpath("//input[@id='txtSearch']")).isDisplayed());
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds (10) ) ;
		signup.EditPasswordFunction("123456", "12345678", "12345678");
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//input[@id='txtSearch']")).isDisplayed());
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
