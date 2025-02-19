package automation.testsuite;
import automation.common.CommonBase;
import automation.constant.CT_PageURL;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeWork_day12 extends CommonBase {
	
	@BeforeMethod
	public void openBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_GLOBALSQA);
	}
	
	@Test
	public void chooseAngolaOption()
	{
	Select dropdownCountry = new Select(driver.findElement(By.xpath("//select")));
	System.out.println("Số lựa chọn của dropdownlist là: " + dropdownCountry.getOptions().size());
	dropdownCountry.selectByContainsVisibleText("Angola");
	String textAfterSelect = dropdownCountry.getFirstSelectedOption().getText();
	System.out.println("Text is: "+textAfterSelect);
	
	System.out.println("Is multiple: " + dropdownCountry.isMultiple());
		
	}

}
