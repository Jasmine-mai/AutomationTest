package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day17_PopupPage;


public class Day18_Homework1_test extends CommonBase {
	@BeforeMethod
	public void openBrowser()
	{
		driver = initFireFoxDriver(CT_PageURL.URL_DIENMAY);
	}
	@Test
	public void verifySuccessfully()
	{
	click(By.xpath("//div[@id='zalo-vr']//child::img[contains(@src,'dienmaynhapkhaugiare')]"));
	String actualURL = driver.getCurrentUrl();
	String expectedURL = "https://dienmaynhapkhaugiare.com.vn/";
	assertEquals(actualURL, expectedURL);	
	}
}
