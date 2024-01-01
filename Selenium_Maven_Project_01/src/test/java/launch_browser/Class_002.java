package launch_browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_002 {

	public static void main(String[] args) {

		// Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.metrorailnagpur.com");
      
		
		
		String ExpectedUrl = "https://www.metrorailnagpur.com/";

		// To capture Url of webApplication
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		// System.out.println(driver.getCurrentUrl());

		// To check actual and expected url
		System.out.println(ExpectedUrl.equals(actualUrl));

	}

}
