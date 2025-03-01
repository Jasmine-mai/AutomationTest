package automation.pageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_BTVN_ALADA_Page {
	private WebDriver driver;

	//Dùng FindBy annotation thay cho findelement
	@FindBy(id="txtFirstname") WebElement texthoTen;
	@FindBy(id="txtEmail") WebElement textEmail;
	@FindBy(id="txtCEmail") WebElement textConfirmEmail;
	@FindBy(id="txtPassword") WebElement textPassword;
	@FindBy(id="txtCPassword") WebElement textConfirmPassword;
	@FindBy(id="txtPhone") WebElement textSĐT;
	@FindBy(id="chkRight") WebElement checkboxAgreement;
	@FindBy(xpath="//button[text()='ĐĂNG KÝ' and @type ='submit']") WebElement buttonSignup;
	
	@FindBy(xpath="///img[@width='40px']") WebElement avatar;
	@FindBy(xpath="//a[text()='Chỉnh sửa thông tin']") WebElement buttonChinhsuathongtin;
	@FindBy(id="txtpassword") WebElement textCurrentPassword;
	@FindBy(id="txtnewpass") WebElement textNewPassword;
	@FindBy(id="txtrenewpass") WebElement textReenterPassword;
	@FindBy(xpath="//button[text()='Lưu mật khẩu mới']") WebElement buttonEditPassword;
	
//	@FindBy(id="txtLoginUsername") WebElement textEmail_login;
//	@FindBy(id="txtLoginPassword") WebElement textPassword_login;
//	@FindBy(xpath="//button[text()='ĐĂNG NHẬP' and @type ='submit']") WebElement buttonLogin;
	
	public Day14_BTVN_ALADA_Page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void SignupFunction(String hoTen, String email, String confirmEmail, String password, String confirmPassword, String SĐT)
	{
		texthoTen.sendKeys(hoTen);
		textEmail.clear();
		textEmail.sendKeys(email);
		textConfirmEmail.sendKeys(email);
		textPassword.clear();
		textPassword.sendKeys(password);
		textConfirmPassword.sendKeys(password);
		textSĐT.sendKeys(SĐT);
		//checkboxAgreement.click();
		buttonSignup.click();
	}
	
//	public void LoginFunction(String email, String password)
//	{
//		textEmail.clear();
//		textEmail.sendKeys(email);
//		textPassword.clear();
//		textPassword.sendKeys(password);
//		buttonLogin.click();
	//}
	public void EditPasswordFunction(String currentPassword, String newPassword, String reenterPassword)
	{
		avatar.click();
		buttonChinhsuathongtin.click();
		textCurrentPassword.sendKeys(currentPassword);
		textNewPassword.sendKeys(newPassword);
		textReenterPassword.sendKeys(reenterPassword);
		buttonEditPassword.click();	
	}

}
