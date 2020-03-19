import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayThreeSeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		WebDriver driver1 = new FirefoxDriver();

		driver.get("https://google.com/");

//		driver.findElement(By.name("username")).sendKeys("Name@craft.com");
//		driver.findElement(By.name("pw")).sendKeys("saleforcepassword");
//		driver.findElement(By.name("Login")).click();

//		driver.findElement(By.id("username")).sendKeys("Name@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("facebookPassword");
//		driver.findElement(By.id("Login")).click();

//		driver.findElement(By.id("email")).sendKeys("Facebook user");
//		driver.findElement(By.name("pass")).sendKeys("Facebook password");
//		driver.findElement(By.linkText("Forgot account?")).click();
//		driver.findElement(By.linkText("Forgot account?")).click();

//		driver.findElement(By.className("inputtext")).sendKeys("HelloWorld");
		
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Find sores Hailu");
		
		
		
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		

	}

}
