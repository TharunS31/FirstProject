import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TARUN\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(7000);
		WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		findElement.sendKeys("tarun");
		Thread.sleep(7000);
		WebElement findElement2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		findElement2.sendKeys("12345");
		
		
//		driver.get("https://www.facebook.com/");
//		
//		driver.manage().window().maximize();
//		
//		WebElement findElement = driver.findElement(By.id("email"));
//		findElement.sendKeys("chellatha@gmail.com");
//		
//		WebElement findElement2 = driver.findElement(By.id("pass"));
//		findElement2.sendKeys("thirisoolam");
//		
//		WebElement findElement3 = driver.findElement(By.name("login"));
//		findElement3.click();
		
		

		
	}

}
