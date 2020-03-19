import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DayTwoSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dj\\Documents\\Selenuim Materials\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		WebDriver driver1 = new FirefoxDriver();

//		String baseUrl = "http://api.icraftsoft.net/register/#!/create";
			
//		String baseUrl = "http://api.icraftsoft.net/register/";
//		

		driver.get("http://api.icraftsoft.net/register/#!/create");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-valid.ng-empty.ng-touched")).sendKeys("firtName");
//		driver.findElement(By.className("form-control ng-pristine ng-valid ng-empty ng-touched")).sendKeys("firtName");
		
//		driver.findElement(By.name("firstName")).sendKeys("firstname");
//		driver.findElement(By.name("lastName")).sendKeys("lastName");
//		driver.findElement(By.name("departmentName")).sendKeys("Cs department");
	
  
		
//		hit url on the browser
//		driver.get("https://www.google.com");
		
//		//to validate if your page title is correct 
//		System.out.println(driver.getTitle());
//		
//		
//		//to validate it you are landed on correct url
//		System.out.println(driver.getCurrentUrl());
//		
//		// if you want to see the page source
//		System.out.println(driver.getPageSource());
//		
////		driver.get("https://yahoo.com");
//		
//		driver.navigate().back();
////	driver.navigate().forward();
//		driver.close();  // It closses current brower
//		driver.quit(); //It closses all the browers opened by selenium
		

		
		
	}

}
