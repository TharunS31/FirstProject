import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TARUN\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2500);
		
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		/*WebElement women = driver.findElement(By.xpath("//a[@title = 'Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).perform();
		
		Thread.sleep(2500);
		
		WebElement tshirt = driver.findElement(By.xpath("//body[@id='category']"));
		ac.moveToElement(tshirt).perform();
		ac.click(tshirt).perform();*/
		
		
		//Automation Test
		
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(login).perform();
		ac.click().perform();
		
		Thread.sleep(2500); 
		
		//WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//ac.moveToElement(email).perform();
		//ac.click().perform();
		//email.sendKeys("ttaaarr11222333@gmail.com");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("tarunnn@gmail.com");
		
		Thread.sleep(2500);
		
		//WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		//ac.moveToElement(submit).perform();
		//ac.click().perform();
		//submit.click();
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("a1b2c3e4g5");
		
		Thread.sleep(3500);
		
		WebElement submt = driver.findElement(By.id("SubmitLogin"));
		submt.click();
		
		Thread.sleep(5500);
		
		/*WebElement auth = driver.findElement(By.xpath("(//input[@type = 'radio'])[1]"));
		ac.moveToElement(auth).perform();
		ac.click().perform();
		
		Thread.sleep(4500);
		
		WebElement fstName = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		ac.moveToElement(fstName).perform();
		ac.click().perform();
		fstName.sendKeys("virat");
		
		Thread.sleep(4500);
		
		
		WebElement lstName = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		ac.moveToElement(lstName).perform();
		ac.click().perform();
		lstName.sendKeys("kohli");
		
		Thread.sleep(4500);
		
		WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		ac.moveToElement(passwd).perform();
		ac.click().perform();
		passwd.sendKeys("a1b2c3e4g5");
		
		Thread.sleep(4500);
		
		WebElement days = driver.findElement(By.id("days"));
		ac.moveToElement(days).perform();
		ac.click().perform();
		Select d = new Select(days);
		d.selectByIndex(5);
		
		Thread.sleep(4500);
		
		WebElement month = driver.findElement(By.id("months"));
		ac.moveToElement(month).perform();
		ac.click().perform();
		Select m = new Select(month);
		m.selectByIndex(11);
		
		Thread.sleep(4500);
		
		WebElement yrs = driver.findElement(By.id("years"));
		ac.moveToElement(yrs).perform();
		ac.click().perform();
		Select y = new Select(yrs);
		y.selectByVisibleText("2018  ");
		
		Thread.sleep(4500);
		
		WebElement company = driver.findElement(By.id("company"));
		ac.moveToElement(company).perform();
		ac.click().perform();
		company.sendKeys("Bank of Kailasha");
		
		Thread.sleep(4500);
		
		WebElement add1 = driver.findElement(By.id("address1"));
		ac.moveToElement(add1).perform();
		ac.click().perform();
		add1.sendKeys("#18, 3rd Nithi st, east kailasha - 999 999");
		
		Thread.sleep(4500);
		
		WebElement add2 = driver.findElement(By.id("address2"));
		ac.moveToElement(add2).perform();
		ac.click().perform();
		add2.sendKeys("Nithi appartment, East kailasha");
		
		Thread.sleep(4500);
		
		WebElement city = driver.findElement(By.id("city"));
		ac.moveToElement(city).perform();
		ac.click().perform();
		city.sendKeys("Meenakshi city");
		
		Thread.sleep(4500);
		
		WebElement state = driver.findElement(By.id("id_state"));
		ac.moveToElement(state).perform();
		ac.click().perform();
		Select s = new Select(state);
		s.selectByIndex(10);

		Thread.sleep(4500);
		
		WebElement post = driver.findElement(By.id("postcode"));
		ac.moveToElement(post).perform();
		ac.click().perform();
		post.sendKeys("99999");
		
		Thread.sleep(4500);
		
		WebElement addinfo = driver.findElement(By.id("other"));
		ac.moveToElement(addinfo).perform();
		ac.click().perform();
		addinfo.sendKeys("9999999999");
		
		Thread.sleep(4500);
		
		WebElement ph = driver.findElement(By.id("phone"));
		ac.moveToElement(ph).perform();
		ac.click().perform();
		ph.sendKeys("9999999999");
		
		Thread.sleep(4500);
		
		WebElement mbl = driver.findElement(By.id("phone_mobile"));
		ac.moveToElement(mbl).perform();
		ac.click().perform();
		mbl.sendKeys("99999999990");
		
		Thread.sleep(4500);
		
		WebElement alias = driver.findElement(By.id("alias"));
		ac.moveToElement(alias).perform();
		ac.click().perform();
		alias.sendKeys("Meenakshi city");
		
		Thread.sleep(4500);
		
		WebElement register = driver.findElement(By.id("submitAccount"));
		ac.moveToElement(register).perform();
		ac.click().perform();*/
		
		Thread.sleep(4500);
		WebElement women = driver.findElement(By.xpath("//a[@title = 'Women']"));

		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));

		Thread.sleep(2000);
		ac.moveToElement(women).build().perform();
		
		Thread.sleep(3000);
		ac.click(tshirt).perform();
		
		Thread.sleep(5000);
		
		//WebElement size = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[2]"));
		//ac.moveToElement(size).perform();
		//ac.click().perform();
		
		//Thread.sleep(5000);
		
		//WebElement clr = driver.findElement(By.xpath("(//input[@type = 'button'])[2]"));
		//ac.moveToElement(clr).perform();
		//ac.click().perform();
		
		Thread.sleep(5000);
		
		WebElement qck = driver.findElement(By.xpath("//img[@itemprop = 'image']"));
		ac.moveToElement(qck).perform();
		ac.click().perform();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		WebElement plus = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		ac.moveToElement(plus).perform();
		ac.click().perform();
		
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		WebElement blue = driver.findElement(By.xpath("//*[@id=\"color_to_pick_list\"]/li[2]"));
		ac.moveToElement(blue).perform();
		ac.click().perform();
		
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		WebElement submtt = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		ac.moveToElement(submtt).perform();
		ac.click().perform();
		
		Thread.sleep(5000);
		WebElement prcd = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		prcd.click();
		
		Thread.sleep(5000);
		WebElement checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ac.moveToElement(checkout).build().perform();
		ac.click(checkout).perform();
		
		Thread.sleep(3000);
		WebElement prcdd = driver.findElement(By.xpath("(//button [@type='submit'])[2]"));
		ac.moveToElement(prcdd).build().perform();
		ac.click(prcdd).perform();

		Thread.sleep(3000);
		WebElement cgv = driver.findElement(By.id("cgv"));
		cgv.click();
		
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("(//button [@type='submit'])[2]"));
		submit.click();
		
		Thread.sleep(3000);
		WebElement bank = driver.findElement(By.xpath("(//div [@class='row'])[6]"));
		bank.click();
		
		Thread.sleep(3000);
		WebElement submitt = driver.findElement(By.xpath("(//button [@type='submit'])[2]"));
		submitt.click();
		
		
		
		
		
	}

}
