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

public class Day16_Homework_Exercise2 extends CommonBase {
	@BeforeMethod
	public void openBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_SELENIUM);
	}
	@Test
	public void pressOkButton()
	{
		click(By.xpath("//button[text()='Try it']"));
		//Kiểm tra message của Alert hiển thị đúng
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		String actualMessage = alert.getText();
		String expectedMessage = "Welcome to Selenium WebDriver Tutorials";
		assertEquals(actualMessage, expectedMessage);
		// Nhap "Class 12" va click Ok => hien thi text "Hello Class 12 How are you today"
		//driver.switchTo().alert().sendKeys("Class 12");
		
		
		driver.switchTo().alert().accept();
//		WebElement elementResult = getELementPresentDOM(By.xpath("//button[text()='Try it']"));
//		String actualText = elementResult.getText();
//		String expectedText = "Hello Class 12 How are you today";
//		assertEquals(actualText, expectedText);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
