package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day15_DatePicker_Input extends CommonBase {
	
	@BeforeMethod
	public void openBrowser()
	{
		driver = initFireFoxDriver("https://demo.guru99.com/test/");			
	}
	
	@Test
	public void typeToDatePicker()
	{
		WebElement datePickerBDay = driver.findElement(By.name("bdaytime"));
		//Remove thuộc tính Readonly nếu có trong thẻ input
		//js.executeScript("arguments[0].removeAttribute('readonly','readonly');", datePickerBDay);
		datePickerBDay.sendKeys("12022020"); 
		//datePickerBDay.sendKeys(Keys.TAB);
		datePickerBDay.sendKeys("0110AM"); 
		datePickerBDay.sendKeys(Keys.TAB);
		driver.findElement (By.xpath("//input[@type='submit']")).click();
		assertTrue(driver.findElement(By.xpath("//div[text()='Your Birth Date is 2020-12-02']")).isDisplayed());
	}

}
