package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;


public class Day18_Homework2_Test extends CommonBase {
	
	@BeforeMethod
	public void openBrowser()
	{
		driver = initFireFoxDriver(CT_PageURL.URL_BEPANTOAN);
	}
	
	@Test
	public void verifySuccessfully()
	{
	click(By.xpath("(//div[@class='w-[40px]'])[1]"));
	String actualURL = driver.getCurrentUrl();
	String expectedURL = "https://bepantoan.vn/";
	assertEquals(actualURL, expectedURL);	
	}

}
