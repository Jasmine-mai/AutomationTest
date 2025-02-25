package automation.pageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver _driver) {
		this.driver = _driver;
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
		WebElement btnSignin = driver.findElement(By.xpath("//button[text()='Đăng nhập' and @type='submit']"));
		btnSignin.click();
	}


}
