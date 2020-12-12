import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import src2.Bclass;

public class BrowserLaunch extends Bclass {
	
	public static WebDriver driver;

	public static void main(String[] args, WebElement mail) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TARUN\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");*/
	
		getBrowser("chrome");
		driver.manage().window().maximize();
		getUrl("https://www.facebook.com/");
		
	//	WebElement mail = driver.findElement(By.id("//input[@id = 'email']"));
	//	mail.sendKeys("kar123@gmail.com");
		
		InputValue(mail, "kar123@gmail.com");
		
		
		
		
		
		/*Thread.sleep(2500);
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(2500);
		driver.navigate().back();
		
		Thread.sleep(2500);
		driver.navigate().forward();
		
		Thread.sleep(2500);
		driver.navigate().refresh();
		
		Thread.sleep(2500);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2500);
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2500);
		driver.quit();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.in/");
		
		//Thread.sleep(2500);
		//driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2500);
		driver1.navigate().refresh();
		
		Thread.sleep(2500);
		driver1.close();*/
	}

}
