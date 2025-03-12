package automation.pageLocator;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.CommonBase;

public class Day17_PopupPage extends CommonBase {
	private WebDriver driver;
	public Day17_PopupPage(WebDriver commonBaseDriver)
	{
	this.driver = commonBaseDriver;
	}
	public void handleChildWindow() 
	{
		click(By.xpath("//a[text()='Click Here']"));
		//Lay main window
		String mainWindow = driver.getWindowHandle();
		//Lay tap hop cac window
		Set<String> windows = driver.getWindowHandles();
		for (String childwindow: windows)
		{
		   if(!childwindow.equals(mainWindow))
		   {
			  driver.switchTo().window(childwindow);
			  type(By.name("emailid"),"testEmail@gmail.com");
			  click(By.name("btnLogin"));
			  assertTrue(isElementDisplay(By.xpath("//h2[text()='Access details to demo site.']")));
			  driver.close();
			  System.out.println("Child window has been close");
		   }
		}
		driver.switchTo().window(mainWindow);
		System.out.println("driver has been switched to main window");
	}
}
