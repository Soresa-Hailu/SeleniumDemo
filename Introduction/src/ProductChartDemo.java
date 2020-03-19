import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductChartDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		WebDriver driver1 = new FirefoxDriver();
		
	
		driver.get("https://www.makemytrip.com");
			
		
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluruu");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		
		
	}

}
