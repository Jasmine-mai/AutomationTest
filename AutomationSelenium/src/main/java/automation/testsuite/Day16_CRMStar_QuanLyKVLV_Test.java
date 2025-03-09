package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day16_CRM_Star_QuanLyKVLV;

public class Day16_CRMStar_QuanLyKVLV_Test extends CommonBase {
	@BeforeMethod
	public void openBrowser()
	{
	driver = initBrowser(CT_PageURL.URL_CRMSTAR);
	}

	@Test
	public void themKLVThanhCong()
	{
	Day16_CRM_Star_QuanLyKVLV crm = new Day16_CRM_Star_QuanLyKVLV(driver);
	crm.loginFunction("admin@gmail.com", "12345678", driver);
	crm.addKVLV("KLV Dung Test", "65325444546", driver);
	}

}
