package automation.testsuite;
import org.testng.annotations.BeforeMethod;
import automation.common.CommonBase;
import automation.constant.CT_PageURL;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Day12_Dropdownlist extends CommonBase{
	@BeforeMethod
	public void openBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_CODESTAR);
	}
	
	@Test
	public void chooseAWSOption()
	{
	Select dropdownCourse = new Select(driver.findElement(By.id("product_categories_filter")));
	System.out.println("Số lựa chọn của dropdownlist là: " + dropdownCourse.getOptions().size());
	dropdownCourse.selectByContainsVisibleText("AWS");
	String textAfterSelect = dropdownCourse.getFirstSelectedOption().getText();
	System.out.println("Text is: "+textAfterSelect);
	
	System.out.println("Is multiple: " + dropdownCourse.isMultiple());
		
	}

}
