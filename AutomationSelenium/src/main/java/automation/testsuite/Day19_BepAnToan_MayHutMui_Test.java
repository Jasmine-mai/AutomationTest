package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.pageLocator.Day19_BepAnToan_MayHutMui_Page;

public class Day19_BepAnToan_MayHutMui_Test extends CommonBase {

	@BeforeMethod
	public void openBrowser()
	{
		driver = initFireFoxDriver(CT_PageURL.URL_BEPANTOAN);
	}
	
	@Test(priority=1)
	public void filterMayHutMui_Bosch()
	{
		Day19_BepAnToan_MayHutMui_Page bosch = new Day19_BepAnToan_MayHutMui_Page(driver);
		bosch.filterHangSanXuat();
	}
	
	@Test(priority=2)
	public void filterMayHutMui_under3M()
	{
		Day19_BepAnToan_MayHutMui_Page under3M = new Day19_BepAnToan_MayHutMui_Page(driver);
		under3M.filterMucGia();
	}
	
	@Test(priority=3)
	public void filterMayHutMui_Indonesia()
	{
		Day19_BepAnToan_MayHutMui_Page indonesia = new Day19_BepAnToan_MayHutMui_Page(driver);
		indonesia.filterXuatXu();
	}
	
	@Test(priority=4)
	public void filterMayHutMui_1000m()
	{
		Day19_BepAnToan_MayHutMui_Page greatest = new Day19_BepAnToan_MayHutMui_Page(driver);
		greatest.filterCongSuat();
	}
	
	@Test(priority=5)
	public void filterMayHutMui_special()
	{
		Day19_BepAnToan_MayHutMui_Page special = new Day19_BepAnToan_MayHutMui_Page(driver);
		special.filterKichThuoc();
	}
	
	@Test(priority=6)
	public void searchMayHutMui()
	{
		Day19_BepAnToan_MayHutMui_Page search = new Day19_BepAnToan_MayHutMui_Page(driver);
		search.searchMayHutMui();
	}
	
	@Test(priority=7)
	public void checkDatHangThanhCong()
	{
		Day19_BepAnToan_MayHutMui_Page order = new Day19_BepAnToan_MayHutMui_Page(driver);
		order.searchMayHutMui();
		order.checkOrderSuccessfully();
	}
	
	@Test(priority=8)
	public void checkDatHangKhongThanhCong()
	{
		Day19_BepAnToan_MayHutMui_Page order = new Day19_BepAnToan_MayHutMui_Page(driver);
		order.searchMayHutMui();
		order.checkOrderUnsuccessfully();
		assertTrue(driver.findElement(By.xpath("//small[normalize-space(text())='Số điện thoại không hợp lệ']")).isDisplayed());
	}
	
	@Test(priority=9)
	public void checkTraGopKhongThanhCong()
	{
		Day19_BepAnToan_MayHutMui_Page order = new Day19_BepAnToan_MayHutMui_Page(driver);
		order.searchMayHutMui();
		order.checkTraGopUnsuccessfully();
		assertTrue(driver.findElement(By.xpath("(//small[normalize-space(text())='Số điện thoại không hợp lệ'])[2]")).isDisplayed());
	}
	
	@Test(priority=10)
	public void checkNhanKhuyenMaiKhongThanhCong()
	{
		Day19_BepAnToan_MayHutMui_Page discount = new Day19_BepAnToan_MayHutMui_Page(driver);
		discount.searchMayHutMui();
		discount.dangKyKhuyenMaiUnsuccessfully();
		assertTrue(driver.findElement(By.xpath("(//small[text()=' Số điện thoại không hợp lệ '])[1]")).isDisplayed());
	}
	
	@Test(priority=11)
	public void checkDanhGiaSanPham()throws InterruptedException
	{
		Day19_BepAnToan_MayHutMui_Page comment = new Day19_BepAnToan_MayHutMui_Page(driver);
		comment.searchMayHutMui();
		comment.checkDanhGia();
	}
	


}
