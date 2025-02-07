package automation.testsuite;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import automation.common.CommonBase;

public final class TS_PracticeLocateElement extends CommonBase {
	@BeforeMethod
	public void openBrowserTest()
	{
		driver = initBrowser("https://selectorshub.com/xpath-practice-page/");
	}
	
	@Test
	public void locateById()
	{
		WebElement textPassword = driver.findElement(By.id("pass"));
		System.out.println("Password element is:" +textPassword);
	}
	
	@Test
	public void locateByName()
	
	{
		WebElement textUserEmail = driver.findElement(By.name("email"));
		System.out.println("User Email element is: " +textUserEmail);
		
		WebElement textPassword = driver.findElement(By.name("Password"));
		System.out.println("Password element is: " +textPassword);
		
		WebElement textCompany = driver.findElement(By.name("company"));
		System.out.println("Company element is: " +textCompany);
		
		WebElement textMobileNumber = driver.findElement(By.name("mobile number"));
		System.out.println("Company element is: " +textMobileNumber);
	}
	
	@Test
	public void locateByLinkText()
	{
		WebElement linkDownloadLink = driver.findElement(By.linkText("DownLoad Link"));
		System.out.println("Link Download link is: " +linkDownloadLink);	
		
		WebElement linkDonation = driver.findElement(By.partialLinkText("Consider a small Donation"));
		System.out.println("Link Donation is: " +linkDonation);			
	}
	
	@Test
	public void locateByClassName()
	{
		WebElement textMobileNumber = driver.findElement(By.className("form-control"));
		System.out.println("Mobile Number element is: " +textMobileNumber);		
	}
	
	@Test
	public void locateByTagName()
	{
		WebElement textInput = driver.findElement(By.tagName("input"));
		System.out.println(textInput);	
	}

}
