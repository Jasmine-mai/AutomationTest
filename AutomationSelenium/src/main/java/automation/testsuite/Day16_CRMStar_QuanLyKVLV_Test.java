package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day16_CRM_Star_QuanLyKVLV;

public class Day16_CRMStar_QuanLyKVLV_Test extends CommonBase {
	String maKLV = "0206";
	@Parameters("browserTestNG")// Teen param trong phương thức test mà file testNG.xml ánh xạ tới
	@BeforeMethod
	public void openBrowser(String browserTestNG)// Tên param mà phương thức test sẽ tìm giá trị trong file testNG.xml
	{
		driver = setupDriver(browserTestNG);
		driver.get(CT_PageURL.URL_CRMSTAR);
	//driver = initFireFoxDriver(CT_PageURL.URL_CRMSTAR);
	}

	@Test(priority = 1)
	public void themKLVThanhCong()
	{
	Day16_CRM_Star_QuanLyKVLV crm = new Day16_CRM_Star_QuanLyKVLV(driver);
	crm.loginFunction("admin@gmail.com", "12345678");
	crm.addKVLV("KLV Dung test", maKLV);
	}
	
	@Test(priority = 2)
	public void xoaKLVThanhCong()
	{
	Day16_CRM_Star_QuanLyKVLV crm = new Day16_CRM_Star_QuanLyKVLV(driver);
	crm.loginFunction("admin@gmail.com", "12345678");
	crm.searchKLV("KLV Dung test");
	crm.xoaKLV(maKLV);
	}

}
