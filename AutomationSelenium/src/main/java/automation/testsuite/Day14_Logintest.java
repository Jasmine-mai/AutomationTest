package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day14_LoginPageFactory;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Day14_Logintest extends CommonBase {
	@BeforeMethod
	public void OpenBrowser()
	{		
		driver = initFireFoxDriver(CT_PageURL.URL_ALADA);
	}
	
	@Test(priority=1)
	public void LoginSuccessfully()
	{
		Day14_LoginPageFactory login = new Day14_LoginPageFactory(driver);
		login.LoginFunction("demoemail@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//div[@class='login']/child::a[text()='Khóa học của tôi']")).isDisplayed());
		
	}
	@Test(priority=2)
	public void LoginFail_IncorrectPass()
	{
		Day14_LoginPageFactory login = new Day14_LoginPageFactory(driver);
		login.LoginFunction("demoemail@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Mật khẩu sai.']")).isDisplayed());
		
	}
	@Test(priority=3)
	public void LoginFail_IncorrectEmail()
	{
		Day14_LoginPageFactory login = new Day14_LoginPageFactory(driver);
		login.LoginFunction("demoemail1hfjdsfh@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//p[text()='Email này chưa được đăng ký.']")).isDisplayed());
		
	}
	@Test(priority=4)
	public void Logout()
	{
		Day14_LoginPageFactory login = new Day14_LoginPageFactory(driver);
		login.LoginFunction("demoemail@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//div[@class='login']/child::a[text()='Khóa học của tôi']")).isDisplayed());
		login.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//a[text()='Đăng Nhập']")).isDisplayed());
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
