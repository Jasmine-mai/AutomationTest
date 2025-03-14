package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day16_CRM_Star_QuanLyKVLV;

public class Day16_CRMStar_QuanLyKVLV_Test extends CommonBase {
	String maKLV = "4433221100";
	//String maKLV = "6532523232";
	@BeforeMethod
	public void openBrowser()
	{
	driver = initFireFoxDriver(CT_PageURL.URL_CRMSTAR);
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
