package automation.pageLocator;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day15_TADA_UpdatePassword_Page {
	private WebDriver driver;
	
	@FindBy(id="UserName") WebElement textUsername;
	@FindBy(id="Password") WebElement textPassword;
	@FindBy(xpath="//button[text()='Đăng nhập']") WebElement buttonLogin;
	@FindBy(id="onesignal-slidedown-cancel-button") WebElement buttonCancelPopup;
	@FindBy(id="my_account") WebElement buttonMyaccount;
	@FindBy(xpath="//a[@title='Đổi mật khẩu']") WebElement buttonChangepass;
	
	@FindBy(id="OldPassword") WebElement textOldpass;
	@FindBy(id="NewPassword") WebElement textNewpass;
	@FindBy(id="ConfirmNewPassword") WebElement textConfirmpass;
	@FindBy(xpath="//input[@value='Cập nhật']") WebElement buttonUpdatepass;
	
	@FindBy(xpath="//a[@title='Khóa học']") WebElement buttonKHoahoc;
	@FindBy(name="keyword") WebElement searchboxTimkhoahoc;
	@FindBy(xpath="//button[@type='submit']/child::i") WebElement buttonSearch;
	
	
	public Day15_TADA_UpdatePassword_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void loginFunction(String username, String password)
	{
		textUsername.sendKeys(username);
		textPassword.sendKeys(password);
		buttonLogin.click();
	}
	
	public void updatePass(String oldPass, String newPass) throws InterruptedException
	{
		buttonCancelPopup.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", buttonMyaccount);
		//buttonMyaccount.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", buttonChangepass);
		Thread.sleep(2000);
		textOldpass.sendKeys(oldPass);
		Thread.sleep(2000);
		textNewpass.sendKeys(newPass);
		Thread.sleep(2000);
		textConfirmpass.sendKeys(newPass);
		buttonUpdatepass.click();
			
	}

	public void searchKhoahoc(String khoahoc)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", buttonKHoahoc);
		searchboxTimkhoahoc.sendKeys(khoahoc);
		js.executeScript("arguments[0].click();", buttonSearch);
	}
}
