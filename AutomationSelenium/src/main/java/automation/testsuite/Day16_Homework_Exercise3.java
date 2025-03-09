package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day16_Homework_Exercise3 extends CommonBase {
	@BeforeMethod
	public void openBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_DEMOGURU99);
	}
	@Test
	public void verifySucxessfully()
	{
		driver.findElement(By.name("cusid")).sendKeys("7676767");
		click(By.name("submit"));
		//Alert1 xuất hiện và chấp nhận
		driver.switchTo().alert().accept();
		//Alert2 xuất hiện, ktra message và chấp nhận
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String actualMessage = alert.getText();
		String expectedMessage = "Customer Successfully Delete!";
		assertEquals(actualMessage, expectedMessage);
		driver.switchTo().alert().accept();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
