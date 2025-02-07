package automation.testsuite;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import automation.common.CommonBase;

public class TS_PracticeLocateElement_Ex2 extends CommonBase {
	
	@BeforeMethod
	public void openBrowserTest()
	{
		driver = initBrowser("https://automationfc.github.io/basic-form/index.html");
	}
	
	@Test
	public void locateById()
	{
		WebElement textName = driver.findElement(By.id("name"));
		System.out.println("Name element is:" +textName);
		
		WebElement textAddress = driver.findElement(By.id("address"));
		System.out.println("Address element is:" +textAddress);
		
		WebElement textEmail = driver.findElement(By.id("email"));
		System.out.println("Email element is:" +textEmail);
		
		WebElement textPassword = driver.findElement(By.id("password"));
		System.out.println("Password element is:" +textPassword);
	
	}
	
	@Test
	public void locateByName()
	
	{
		WebElement textName = driver.findElement(By.name("name"));
		System.out.println("Name element is: " +textName);
		
		WebElement textAddress = driver.findElement(By.name("address"));
		System.out.println("Address element is: " +textAddress);
		
		WebElement textEmail = driver.findElement(By.name("email"));
		System.out.println("Email element is: " +textEmail);
		
		WebElement textPassword = driver.findElement(By.name("password"));
		System.out.println("Password element is: " +textPassword);
	}
	
	@Test
	public void locateByLinkText()
	{
		WebElement linkHoverOverMe = driver.findElement(By.linkText("Hover over me"));
		System.out.println("Link Hover over me is: " +linkHoverOverMe);	
		
		WebElement linkOverMe = driver.findElement(By.partialLinkText("over me"));
		System.out.println("Link Donation is: " +linkOverMe);			
	}
	
//	@Test(k có element nào có classname)
//	public void locateByClassName()
//	{
//		WebElement textMobileNumber = driver.findElement(By.className("form-control"));
//		System.out.println("Mobile Number element is: " +textMobileNumber);		
//	}
	
	@Test
	public void locateByTagName()
	{
		WebElement textInput = driver.findElement(By.tagName("input"));
		System.out.println(textInput);	
	}


}
