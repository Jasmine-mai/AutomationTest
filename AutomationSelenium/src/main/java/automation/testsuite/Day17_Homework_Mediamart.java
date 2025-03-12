package automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day17_Homework_Mediamart extends CommonBase {
	@BeforeMethod
	public void openBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_MEDIAMART);
	}
	@Test
	public void testZaloChat()
	{
		driver.switchTo().frame(getELementPresentDOM(By.xpath("(//iframe[contains(@src, 'page.widget.zalo.me')])")));
		click(By.xpath("//div[@class='logo']/child::img"));
		assertTrue(isElementDisplay(By.xpath("//p[@class='text-hint-welcome']"))) ;
       
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
