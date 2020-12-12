import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TARUN\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();
		Thread.sleep(2500);

		WebElement mail = driver.findElement(By.id("//input[@id = 'email']"));
		boolean displayed = mail.isDisplayed();
		System.out.println(displayed);

		mail.sendKeys("abcd@gmail.com");

	}

}
