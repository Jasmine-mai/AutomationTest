package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day14_LoginPageFactory;
import automation.pageLocator.Day15_TADA_UpdatePassword_Page;

public class Day15_TADA_UpdatePassword_Test extends CommonBase {
	String password="12345678";
	
	@BeforeMethod
	public void openBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_TADA);
	}
	
	@Test
	public void loginSuccessfully()
	{
		Day15_TADA_UpdatePassword_Page tada = new Day15_TADA_UpdatePassword_Page(driver);
		tada.loginFunction("maidung180699@gmail.com", password);
		assertTrue(driver.findElement(By.id("my_account")).isDisplayed());	
	}
	
	@Test(priority=1)
	public void updatePassSuccessfully() throws InterruptedException
	{
		loginSuccessfully();
		Thread.sleep(3000);
		Day15_TADA_UpdatePassword_Page tada = new Day15_TADA_UpdatePassword_Page(driver);
		tada.updatePass("12345678", "123456");
		password = "123456";
		assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Đổi mật khẩu thành công')]")).isDisplayed());
	}
	@Test(priority=2)
	public void updatePassSuccessfullyBack() throws InterruptedException
	{
		loginSuccessfully();
		Thread.sleep(3000);
		Day15_TADA_UpdatePassword_Page tada = new Day15_TADA_UpdatePassword_Page(driver);
		tada.updatePass("123456", "12345678");
		password = "12345678";
		assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Đổi mật khẩu thành công')]")).isDisplayed());
	}
	
	@Test(priority=3)
	public void searchKHoahoc() throws InterruptedException
	{
		loginSuccessfully();
		Thread.sleep(3000);
		Day15_TADA_UpdatePassword_Page tada = new Day15_TADA_UpdatePassword_Page(driver);
		tada.searchKhoahoc("ASP Net");
		assertTrue(driver.findElement(By.xpath("//a[@title='Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP']")).isDisplayed());	
	}
	
}
