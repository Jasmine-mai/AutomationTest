package automation.testsuite;
import org.testng.annotations.BeforeMethod;
import automation.common.CommonBase;
import automation.constant.CT_PageURL;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;

public class Day12 extends CommonBase {
	@BeforeMethod
	public void openBrowserTest()
	{
		driver = initBrowser(CT_PageURL.URL_DEMOQA);
	}
	@Test
	public void clickCheckbox()
	{
		WebElement checkboxSport=driver.findElement(By.id("hobbies-checkbox-1"));
		if(checkboxSport.isSelected()==false)
		{
			driver.findElement(By.xpath("//label[text()='Sports']")).click();
			System.out.println("Checkbox Sport has clicked!");
		}
		
		WebElement checkboxReading=driver.findElement(By.id("hobbies-checkbox-2"));
		if(checkboxReading.isSelected()==false)
		{
			driver.findElement(By.xpath("//label[text()='Reading']")).click();
			System.out.println("Checkbox Reading has clicked!");
		}
	}
	
	@Test
	public void clickMultiple()
	{
		List<WebElement> listCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox : listCheckBox) {
			if(checkbox.isSelected()==false)
			{
				checkbox.click();
			}
		}
	}
	
	@Test
	public void clickRadioButton()
	{
		WebElement radioMale = driver.findElement(By.xpath("//label[text()='Male']"));
		//1.Kiểm tra giá trị mặc định của radioMale là chưa clicked
		boolean isClickedMale = radioMale.isSelected();
		System.out.println("Radio male is clicked: "+ isClickedMale);
		//2. Kiểm tra radio male enable thì click
		if(radioMale.isEnabled()== true);
		{
			radioMale.click();
		}
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
}
