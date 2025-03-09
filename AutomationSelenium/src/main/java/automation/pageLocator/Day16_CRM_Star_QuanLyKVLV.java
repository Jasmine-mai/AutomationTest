package automation.pageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.CommonBase;

public class Day16_CRM_Star_QuanLyKVLV extends CommonBase {
	private WebDriver driver;
	public Day16_CRM_Star_QuanLyKVLV(WebDriver driver) {
		this.driver = driver;
	}
		public void loginFunction(String username, String pass, WebDriver driver)
	{
		type(By.id("email"), username);
		type(By.id("password"), pass);
		click(By.name ("signin"));
	}
		public void addKVLV(String tenKLV, String maKLV, WebDriver driver) {
			click(By.xpath("//a[normalize-space()='Quản lý khu làm việc']"));
			click(By.xpath("//button[text()='Thêm mới']"));
			type(By.name("work_areas_code"),maKLV);
			type(By.name("name"),tenKLV);
			click(By.xpath("//button[text()='Lưu']"));
		}
}
