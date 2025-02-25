package automation.testsuite;
import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.LoginPage;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginTest3 extends CommonBase {
	
	@BeforeMethod
	public void OpenBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_DEMOQA);
	}
	
	@Test
	public void loginSuccessfully()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@gmail.com", "12345678");
		//Assert Dashboard display
		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']")).isDisplayed());
	}
	
	@Test
	public void loginFail_IncorrectPass()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("demoemail@gmail.com", "123456_incorrect");
		//Assert Dashboard display
		assertTrue(driver.findElement(By.xpath("//p[text()='Mật khẩu sai.']")).isDisplayed());
	}
	
	@Test
	public void loginFail_IncorrectEmail()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("demo2email@gmail.com", "123456");
		//Assert Dashboard display
		assertTrue(driver.findElement(By.xpath("//p[text()='Email này chưa được đăng ký.']")).isDisplayed());
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
