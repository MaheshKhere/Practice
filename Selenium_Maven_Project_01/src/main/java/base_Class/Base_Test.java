package base_Class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Base_Test {

	public static WebDriver driver;

	// Dynamic code
	public static void takescreenshot(String screenshotname) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("../Maven_TestNG_Project/ScreenShot/" + screenshotname + ".png");
		FileHandler.copy(src, target);
	}

	// Dynamic code for browser launch
	public static void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions option_1 = new FirefoxOptions();
			option_1.addArguments("--disable-notifications");
			driver = new FirefoxDriver(option_1);
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Launch Browser is:- " + browser);
	}

	public static void NavigateUrl(String url) {
		driver.get(url);
		System.out.println("Navigate Url is:- " + url);
		System.out.println("Title Of WebPage is:- " + driver.getTitle());
	}

}