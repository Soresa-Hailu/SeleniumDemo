import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		WebDriver driver1 = new FirefoxDriver();

		driver.get("http://spicejet.com");

//		driver.findElement(By.id("divpaxinfo")).click();
//
//		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		s.selectByValue("4");
//		Thread.sleep(5000);
//
//		s.selectByVisibleText("2");
//
//		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//		s2.selectByValue("USD");
//		s2.selectByVisibleText("INR");
//
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//
//		Thread.sleep(2000);
//
////		driver.findElement(By.xpath("(//a[@value='KNU'])[2]")).click();
//		driver.findElement(
//				By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='KNU'])")).click();

//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
//		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
//		System.out.print(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		

		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		
		
		
////		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
//
//		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
//
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
////		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
//
////		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
//
//		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		//radioButton
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
//
//		
//		
//		driver.findElement(By.xpath("//div[@id='Div1']//button[@class='ui-datepicker-trigger']")).click();
//		
//		Thread.sleep(3000);
////
//		
//		////a[@class='ui-state-default ui-state-hover']
//		
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		

		
		
		
		
		
		
		
		
		
		
		
		
//
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	

//	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	

//		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
//			System.out.println("It's enabled");
//			Assert.assertTrue(false);
//		}
//
//		else {
//			Assert.assertTrue(true);
//		}

//	    Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//	    s2.selectByValue("USD");
//	    
//	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
