package automation.testsuite;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import automation.common.CommonBase;

public class LoginTest extends CommonBase {
	@BeforeMethod
	public void openBrowserTest()
	{
		driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
	}
	
	@Test
	
	public void locateById()
	{
		WebElement textUsername = driver.findElement(By.id("txtLoginUsername"));
		System.out.println("Username element is: " +textUsername);
		
		WebElement textPassword = driver.findElement(By.id("txtLoginPassword"));
		System.out.println("Password element is: " +textPassword);
	}
	
	@Test
	public void locateByName()
	{
		WebElement textUsername = driver.findElement(By.name("txtLoginUsername"));
		System.out.println("Username element is: " +textUsername);
		
		WebElement textPassword = driver.findElement(By.name("txtLoginPassword"));
		System.out.println("Password element is: " +textPassword);
	}
	
	@Test
	public void locateByClassName()
	{
		WebElement btnFaceBook = driver.findElement(By.className("btn_face"));
		System.out.println("Button facebook element is: " +btnFaceBook);
		
	}
	
	@Test
	public void locateByLinkText()
	{
		WebElement linkForgotPassword = driver.findElement(By.linkText("Quên mật khẩu?"));
		System.out.println("Link Forgot Password is: " +linkForgotPassword);	
		
		WebElement linkGiangVien = driver.findElement(By.partialLinkText("giảng viên"));
		System.out.println("Link login for trainer is: " +linkGiangVien);	
		
	}
	
	@Test
	public void locateByTagName()
	{
		WebElement textInput = driver.findElement(By.tagName("input"));
		System.out.println(textInput);	
	}
	
	
	
}
