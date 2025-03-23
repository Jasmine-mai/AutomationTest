package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day16_AlertTest extends CommonBase {
	@BeforeMethod
	@Parameters("browserTestNG") 
	public void openBrowser(@Optional("firefox") String browserTestNG)
	{
		driver = setupDriver(browserTestNG);
		driver.get(CT_PageURL.URL_ALERTDEMO);
	}
	@Test
	public void pressOkButton()
	{
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[@class='btn btn-info']"));
		//Kiểm tra message của Alert hiển thị đúng
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please enter your name";
		assertEquals(actualMessage, expectedMessage);
		// Nhap "Class 12" va click Ok => hien thi text "Hello Class 12 How are you today"
		driver.switchTo().alert().sendKeys("Class 12");
		driver.switchTo().alert().accept();
		WebElement elementResult = getELementPresentDOM(By.id("demo1"));
		String actualText = elementResult.getText();
		String expectedText = "Hello Class 12 How are you today";
		assertEquals(actualText, expectedText);
	}
	
	@Test
	public void pressCancelButton()
	{
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[@class='btn btn-info']"));
		//Kiểm tra message của Alert hiển thị đúng
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please enter your name";
		assertEquals(actualMessage, expectedMessage);
		// Nhap "Class 12" va click Ok => hien thi text "Hello Class 12 How are you today"
		driver.switchTo().alert().sendKeys("Class 12");
		driver.switchTo().alert().dismiss();
		assertFalse(isElementDisplay(By.id("demo1")));
	}

	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
