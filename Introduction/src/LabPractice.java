import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dj\\Documents\\Selenuim Materials\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		WebDriver driver1 = new FirefoxDriver();
		

		driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.findElement(By.id("name")).sendKeys("Soresa Hailu");
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
        Thread.sleep(20000);
        
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
		
		
	}

}
