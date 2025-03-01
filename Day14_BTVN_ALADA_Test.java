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
	String hoTen = "Dung Mai";
	String email = "maidung180699+10011@gmail.com";
//	String confirmEmail = "maidung180699+100@gmail.com"; 
	String password = "123456";
//	String confirmPassword = "123456";
	String phone = "0355643789";
	
	String newPassword = "12345678";
	
	String messageSuccess = "Cập nhật mật khẩu mới thành công!";
	
	
	
	@BeforeMethod
	public void OpenBrowser()
	{		
		driver = initFireFoxDriver(CT_PageURL.URL_ALADA_SIGNUP);
//		driver = initFireFoxDriver(CT_PageURL.URL_ALADA);
	}
	
	@Test(priority=1)
	public void SignupSuccessfully()
	{
		Day14_BTVN_ALADA_Page signup = new Day14_BTVN_ALADA_Page(driver);
		signup.SignupFunction(hoTen, email, email, password, password, phone);
		assertTrue(driver.findElement(By.xpath("//input[@id='txtSearch']")).isDisplayed());
	}
	
	@Test(priority=2)
	public void EditPasswordFunction()
	{
		driver.get(CT_PageURL.URL_ALADA);
		Day14_BTVN_ALADA_Page login = new Day14_BTVN_ALADA_Page(driver);
		login.LoginFunction(email, password);
		assertTrue(driver.findElement(By.xpath("//input[@id='txtSearch']")).isDisplayed());
		login.EditPasswordFunction(driver, password, newPassword, newPassword);
		driver.switchTo().alert().accept();
	}
	
	@Test(priority=3)
	public void LoginNewPasswordFunction()
	{
		driver.get(CT_PageURL.URL_ALADA);
		Day14_BTVN_ALADA_Page login = new Day14_BTVN_ALADA_Page(driver);
		login.LoginFunction(email, newPassword);
		assertTrue(driver.findElement(By.xpath("//input[@id='txtSearch']")).isDisplayed());
	}

	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
