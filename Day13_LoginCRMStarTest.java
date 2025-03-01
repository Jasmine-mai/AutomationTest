package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day13_LoginCRMStar_Page;

public class Day13_LoginCRMStarTest extends CommonBase{
	
	@BeforeMethod
	public void OpenBrowser()
	{		
		driver = initFireFoxDriver(CT_PageURL.URL_CRMSTAR);
	}
	
	@Test
	public void loginSuccessfully()
	{
		Day13_LoginCRMStar_Page login = new Day13_LoginCRMStar_Page(driver);
		login.LoginFunction("admin@gmail.com","12345678");
//		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());

	}
	@Test
	public void themNhanVien()
	{
		Day13_LoginCRMStar_Page login = new Day13_LoginCRMStar_Page(driver);
		login.LoginFunction("admin@gmail.com", "12345678" );
		assertTrue(driver.findElement(By.xpath("//p[text()= 'Quản lý người dùng']")). isDisplayed()); 
		login.chucnangThemMoiNhanVien("Jasmine","jasmine@gmail.com", "355675765", "Quản Lý", "2", "1", "00101") ;
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
