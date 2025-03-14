package automation.pageLocator;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.common.CommonBase;

public class Day16_CRM_Star_QuanLyKVLV extends CommonBase {
	private WebDriver driver;
	public Day16_CRM_Star_QuanLyKVLV(WebDriver commonBaseDriver) {
		this.driver = commonBaseDriver;
	}
	public void loginFunction(String username, String pass)
	{
		type(By.id("email"), username);
		type(By.id("password"), pass);
		click(By.name("signin"));
	}
	public void addKVLV(String tenKLV, String maKLV) {
			click(By.xpath("//a[normalize-space()='Quản lý khu làm việc']"));
			click(By.xpath("//button[text()='Thêm mới']"));
			type(By.name("work_areas_code"),maKLV);
			type(By.name("name"),tenKLV);
			click(By.xpath("//button[text()='Lưu']"));
			click(By.xpath("//button[@class='btn btn-success' and text()='Thêm']"));
		}
	//1. Tìm kiếm KVLV theo tên KLV
	public void searchKLV(String tenKLV)
	{
		click(By.xpath("//a[normalize-space()='Quản lý khu làm việc']"));
		type(By.xpath("//input[@class='form-control me-3']"), tenKLV);
		click(By.xpath("//button[@type='submit' and text()='Tìm kiếm']"));
	}
	//2. Xoá theo maKLV
	public void xoaKLV(String maKLV)
	{
		click(By.xpath("//td[text()='"+maKLV+"']/following-sibling::td/a[normalize-space()='Xóa']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
}
