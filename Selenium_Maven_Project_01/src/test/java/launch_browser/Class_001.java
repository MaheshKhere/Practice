package launch_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Class_001 {

	public static void main(String[] args) {
		
		// Launch Chrome
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://amazon.com");
		//driver.quit();
		
		//Launch Firefox
		
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		System.out.println(logo.getSize());
//		WebDriver driver_1 = new FirefoxDriver();
//		driver_1.manage().window().maximize();
//		driver_1.get("https://www.selenium.dev/");
//		
		
		
		

	}

}
