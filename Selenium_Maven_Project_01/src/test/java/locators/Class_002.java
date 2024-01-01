package locators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_002 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in/");
		
		// To capture get title
		System.out.println(driver.getTitle());
		
		// Capture Current url
		System.out.println(driver.getCurrentUrl());
		
		// Close window
		//driver.close();
		
		// quite
		driver.quit();

	}

}
