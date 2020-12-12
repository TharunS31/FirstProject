package src2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

//browserLaunch

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {
		try {
			{
				if (browserName.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\TARUN\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browserName.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver",
							"C:\\Users\\TARUN\\eclipse-workspace\\SeleniumNew\\Drivers\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				} else {
					System.out.println("Invalid BrowserName");
				}
				driver.manage().window().maximize();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

//getUrl

	public static void getUrl(String URL) {
		try {
			driver.get(URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//click

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//navigateTo

	public static void navigateTo(String URL) {
		try {
			driver.navigate().to(URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//navigateBack

	public static void navitageBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//navigateForward

	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//navigateRefresh()		

	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//getUrl

	public static void get(String URL) {
		try {
			driver.get(URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//simpleAlert

	public static void simpleAlert() {
		try {
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//confirmAlert

	public static void confirmAlert() {
		try {
			Alert confirmAlert = driver.switchTo().alert();
			confirmAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//promptAlert

	public static void promptAlert() {
		try {
			Alert promptAlert = driver.switchTo().alert();
			promptAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//actions

	public static void actions(WebElement element) {
		try {
			Actions actn = new Actions(driver);
			actn.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//singleFrame

	public static void singleFrame(String value) {
		try {
			driver.switchTo().frame(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//frames
	public static void frames(String element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//iframes

	public static void defaultContent() {

		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//windowHandle

	public static void windowHandle() {
		try {
			String parentId = driver.getWindowHandle();
			System.out.println(parentId);

			Set<String> allId = driver.getWindowHandles();
			for (String id : allId)
				System.out.println(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//implicit

	public static void implicit() {

		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//explicit

	public static void explicitWait(long timeOutInSeconds, WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//fluent

//robot

	public static void robot() throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

//windowHandles

	public static void windowHandles(String value) {
		try {
			String parentId = driver.getWindowHandle();
			System.out.println(parentId);

			Set<String> allId = driver.getWindowHandles();
			for (String id : allId) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
			}
			String actualTitle = value;
			for (String id : allId) {
				if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//dropDown

	public static void dropDown(WebElement element, String option, String input) {

		try {
			Select s = new Select(element);

			if (option.equals("index")) {
				int parseInt = Integer.parseInt(input);
				s.deselectByIndex(parseInt);
			} else if (option.equals("value")) {
				s.deselectByValue(input);

			} else if (option.equals("text")) {
				s.selectByVisibleText(input);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

//isEnable

	public static void isEnable(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//isDisplay

	public static void isDisplay(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//isSelected

	public static void isSelected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//getTitle

	public static void getTitle(WebDriver element) {

		try {
			element.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//getCurrentUrl

	public static void getCurrentUrl() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//getText

	public static void getText(WebElement element) {
		try {
			System.out.println(element.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//getAttributes


//takeScreenShot

	public static void screenShot(File filename) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File(System.getProperty("user.dir"+"\\Screenshot\\"+filename+".png"));
			FileUtils.copyFile(srcFile, destFile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}

//scrollUp and scrollDown

	public static void scrollUp(Object element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			js.executeScript("window.scrollBy(0,-4000)");
			js.executeScript("window.scrollBy(0,4000)");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



//sendKeys

	public static void sendKeys(WebElement element, String name) {
		try {
			element.sendKeys(name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//getFirstSelectOptions

//getAllSelectOptions

//isMultiple

//close

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//quit

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
