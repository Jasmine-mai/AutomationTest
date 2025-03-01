package automation.pageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Day13_LoginCRMStar_Page {
	private WebDriver driver;
	@FindBy(xpath ="//button[text()='Thêm mới']") WebElement buttonThemMoi;
	@FindBy(id="select_department_id") WebElement dropDownDepartment;
	@FindBy(id="select_role_id") WebElement dropDownRole;
	@FindBy(id="select_workarea_id") WebElement dropDownWorkArea;
	@FindBy(name="username") WebElement textHoTen;
	@FindBy(name="email") WebElement textEmail;
	@FindBy(name="phone_number") WebElement textPhoneNumber;
	@FindBy(name="code_user") WebElement textCodeUser;
	@FindBy(xpath="//button[text()='Lưu']") WebElement buttonSave;
	@FindBy(xpath="//button[text()='Thêm']") WebElement buttonThem;

	public Day13_LoginCRMStar_Page(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction(String email, String password)
	{
		WebElement emailTextBox = driver.findElement(By.id("email"));
		//Xoá giá trị mặc định trong textbox email
		if (emailTextBox.isDisplayed()) {
			emailTextBox.clear();
		}
		emailTextBox.clear();
		//Nhập admin@demo.com
		emailTextBox.sendKeys(email);
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		if (passwordTextBox.isDisplayed()) {
			passwordTextBox.clear();
		}
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		
		//Click button Sign in
		WebElement btnSignin = driver.findElement(By.xpath("//button[text()='Đăng nhập']"));
		btnSignin.click();
	}
	
	public void chucnangThemMoiNhanVien(String hoTen, String email, String phoneNumber, String phongBan, String role, String KVLV, String codeUser)
	{
		buttonThemMoi.click();
		
		textHoTen.sendKeys(hoTen);
		textEmail.sendKeys(email);
		textPhoneNumber.sendKeys(phoneNumber);
		
		Select selectPhongBan = new Select(dropDownDepartment) ;
		selectPhongBan.selectByContainsVisibleText(phongBan);

		Select selectChucDanh = new Select(dropDownRole) ;
        selectChucDanh.selectByValue(role);

		Select selectKVLV = new Select(dropDownWorkArea);
		selectKVLV.selectByValue(KVLV);
		
		textCodeUser.sendKeys(codeUser);
		
		buttonSave.click();
		
		buttonThem.click();
	}


}
