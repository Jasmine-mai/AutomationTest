package automation.pageLocator;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.common.CommonBase;

public class Day19_BepAnToan_MayHutMui_Page extends CommonBase{
	private WebDriver driver;
	@FindBy(xpath="//span[text()='Đánh giá ngay']//ancestor::a[@href='javascript:;']") WebElement buttonDanhGia;
	public Day19_BepAnToan_MayHutMui_Page (WebDriver commonBaseDriver)
	{
	this.driver = commonBaseDriver;
	}
//Case 1	
	public void filterHangSanXuat()
	{
		click(By.xpath("//a[text()=' Máy Hút Mùi ']"));
		click(By.xpath("//a[contains(@href,'may-hut-mui/bosch')]"));
		if (isElementDisplay(By.xpath("//div[contains(@class, 'product-list')]/a//h4")) == true) {
			List<WebElement> listProduct = driver
					.findElements(By.xpath("//div[contains(@class, 'product-list')]/a//h4"));
			for (WebElement product : listProduct)
			{
				String actualProductName = product.getText().toUpperCase();
				System.out.println("Máy hút mùi hãng Bosch: "+actualProductName);
				assertTrue(actualProductName.contains("BOSCH"));
			}
			}
			else {
				System.out.println("Fail test");
				assertTrue(isElementDisplay(By.xpath("//div[contains(@class, 'product-list')]/a//h4")));
			}
	}
//Case 2	
	public void filterMucGia()
	{
		click(By.xpath("//a[text()=' Máy Hút Mùi ']"));
		click(By.xpath("//span[normalize-space(text())='< 3.000.000']"));
		if (isElementDisplay(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4")) == true) {
			List<WebElement> listProduct = driver
					.findElements(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4"));
			for (WebElement product : listProduct)
			{
				String actualProductName = product.getText().toUpperCase();
				System.out.println("Máy hút mùi mức giá < 3tr: "+actualProductName);
				assertTrue(actualProductName.contains("MÁY HÚT MÙI"));
			}
			}
			else {
				System.out.println("Fail test");
				assertTrue(isElementDisplay(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4")));
			}	
	}
//Case 3	
	public void filterXuatXu()
	{
		click(By.xpath("//a[text()=' Máy Hút Mùi ']"));
		scrollToElement (By.xpath("//h3[text()='Xuất xứ']"));
		click(By.xpath("(//span[text()='Xem thêm'])[2]"));
		click(By.xpath("//input[@name = 'indonesia7Kzx-1174']"));
		if (isElementDisplay(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4")) == true) {
			List<WebElement> listProduct = driver
					.findElements(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4"));
			for (WebElement product : listProduct)
			{
				String actualProductName = product.getText().toUpperCase();
				System.out.println("Máy hút mùi Indonesia: "+actualProductName);
				assertTrue(actualProductName.contains("MÁY HÚT MÙI"));
			}
			}
			else {
				System.out.println("Fail test");
				assertTrue(isElementDisplay(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4")));
			}	
	}
//Case 4	
	public void filterCongSuat()
	{
		click(By.xpath("//a[text()=' Máy Hút Mùi ']"));
		scrollToElement(By.xpath("//h3[text()='Công Suất']"));
		click(By.xpath("//input[@id='-1000-m3h-1030']"));
		if (isElementDisplay(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4")) == true) {
			List<WebElement> listProduct = driver
					.findElements(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4"));
			for (WebElement product : listProduct)
			{
				String actualProductName = product.getText().toUpperCase();
				System.out.println("Máy hút mùi lớn hơn 1000m3/h: "+actualProductName);
				assertTrue(actualProductName.contains("MÁY HÚT MÙI"));
			}
			}
			else {
				System.out.println("Fail test");
				assertTrue(isElementDisplay(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4")));
			}	
	}
//Case 5	
	public void filterKichThuoc()
	{
		click(By.xpath("//a[text()=' Máy Hút Mùi ']"));
		scrollToElement(By.xpath("//h3[text()='Kích Thước']"));
		click(By.xpath("//input[@id='dac-biet-1070']"));
		if (isElementDisplay(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4")) == true) {
			List<WebElement> listProduct = driver
					.findElements(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4"));
			for (WebElement product : listProduct)
			{
				String actualProductName = product.getText().toUpperCase();
				System.out.println("Máy hút mùi kích thước đặc biệt: "+actualProductName);
				assertTrue(actualProductName.contains("MÁY HÚT MÙI"));
			}
			}
			else {
				System.out.println("Fail test");
				assertTrue(isElementDisplay(By.xpath("//div[@class='flex flex-wrap product-list']/a//h4")));
			}	
	}
//Case 6	
	public void searchMayHutMui()
	{
		type(By.xpath("//input[@placeholder='Tìm sản phẩm bạn mong muốn...']"), "máy hút mùi");
		click(By.xpath("(//div[contains(@class,'justify-center cursor-pointer')])[1]"));
//		click(By.xpath("(//div[contains(@class,'justify-center cursor-pointer')])[1]"));
	}
//Case 7	
	public void checkOrderSuccessfully()
	{
		click(By.xpath("(//div[@class='flex flex-wrap product-list']/a//h4)[4]"));
		click(By.xpath("(//span[text()='Mua ngay'])[1]"));
		type(By.xpath("//input[@placeholder='Nhập họ và tên']"), "Testing Project");
		type(By.xpath("//input[@placeholder='Nhập số điện thoại']"), "098322142313");
		type(By.xpath("//input[@placeholder='Nhập số nhà, tên đường, phường/ xã, quận/huyện, tỉnh/ thành phố']"), "Campuchia");
		click(By.xpath("//button[@type='button']"));
	}
//Case 8	
	public void checkOrderUnsuccessfully()
	{
		click(By.xpath("(//div[@class='flex flex-wrap product-list']/a//h4)[4]"));
		click(By.xpath("(//span[text()='Mua ngay'])[1]"));
		type(By.xpath("//input[@placeholder='Nhập họ và tên']"), "Testing Project");
		type(By.xpath("//input[@placeholder='Nhập số điện thoại']"), "0983221423133434224");

	}
//Case 9	
	public void checkTraGopUnsuccessfully()
	{
		click(By.xpath("(//div[@class='flex flex-wrap product-list']/a//h4)[4]"));
		click(By.xpath("(//span[text()='Mua trả góp'])[1]"));

		String xpath = "(//div[@class='relative w-full overflow-hidden bg-white modal-content rounded-xl'])[4]";
		String inputXpathHoTen = "(//input[@placeholder='Nhập họ và tên'])[2]";
		String inputXpathSoDienThoai = "(//input[@placeholder='Nhập số điện thoại'])[2]";
			type(By.xpath(inputXpathHoTen), "098322142315234543");
			type(By.xpath(inputXpathSoDienThoai), "098322142315234543");
	       

	}
//Case 10	
	public void dangKyKhuyenMaiUnsuccessfully()
	{
		click(By.xpath("(//div[@class='flex flex-wrap product-list']/a//h4)[4]"));
		type(By.xpath("//input[@placeholder='Nhập số điện thoại nhận thông tin khuyến mãi']"), "09686544654592834545");
	}
//Case 11	
	public void checkDanhGia() throws InterruptedException
	{
		click(By.xpath("(//div[@class='flex flex-wrap product-list']/a//h4)[4]"));
		scrollToElement (By.xpath("//span[text()='Đánh giá và nhận xét']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement buttonDanhGia = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Đánh giá ngay']")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", buttonDanhGia);
		String xpath = "(//div[@class='relative w-full overflow-hidden bg-white modal-content rounded-xl'])[6]";
		type(By.xpath("//textarea[@placeholder='Nhập đánh giá']"), "Sản phẩm tốt");
		type(By.xpath("(//input[@placeholder='Nhập họ và tên'])[3]"), "Seila");
		type(By.xpath("(//input[@placeholder='Nhập số điện thoại'])[3]"), "09089776544");
		click(By.xpath("//span[text()='Gửi đánh giá ngay']"));
	}

}
