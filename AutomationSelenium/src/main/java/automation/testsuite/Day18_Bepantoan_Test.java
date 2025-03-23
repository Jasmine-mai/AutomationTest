package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day18_Bepantoan_Test extends CommonBase {
	@BeforeMethod
	public void openBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_BEPANTOAN);
	}
	
	@Test
	public void testBepTu_Bosch()
	{
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		click(By.xpath("(//a[contains(@href,'bep-tu/bosch')])[1]"));
		if (isElementDisplay(By.xpath("//div[contains(@class, 'product-list')]/a//h4")) == true) {
		List<WebElement> listProduct = driver
				.findElements(By.xpath("//div[contains(@class, 'product-list')]/a//h4"));
		for (WebElement product : listProduct)
		{
			String actualProductName = product.getText().toUpperCase();
			System.out.println("Tên sản phẩm trên màn hình: "+actualProductName);
			assertTrue(actualProductName.contains("BOSCH"));
		}
		}
		else {
			System.out.println("Fail test");
			assertTrue(isElementDisplay(By.xpath("//div[contains(@class, 'product-list')]/a//h4")));
		}
	}
}
