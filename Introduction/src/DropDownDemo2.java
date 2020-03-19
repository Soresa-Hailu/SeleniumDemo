import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		WebDriver driver1 = new FirefoxDriver();
		
	
		driver.get("https://www.yahoo.com/");
		Thread.sleep(3000);
		
		WebElement elt = driver.findElement(By.id("header-search-input"));
		
		elt.sendKeys("selenium");
		Thread.sleep(2000);
        
		for(int j=1; j<=3; j++) 
		{
			elt.sendKeys(Keys.ARROW_DOWN);
		}


		elt.sendKeys(Keys.ENTER);
		
		
//		WebElement elt =  driver.findElement(By.id("header-search-input"));
//		elt.sendKeys("Selenuium");
//		Thread.sleep(5000);
//		for(int i=1; i<=4; i++) {
//			elt.sendKeys(Keys.ARROW_DOWN);
//		}
//		
////		driver.findElement(By.id("header-search-input")).sendKeys(Keys.ARROW_DOWN);
//		elt.sendKeys(Keys.ENTER);
		
		
	}

}
