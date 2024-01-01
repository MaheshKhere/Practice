package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		// Click on link
		//driver.findElement(By.linkText("Best Sellers")).click();
		//driver.findElement(By.partialLinkText("Sellers")).click();
		
		// 
		//driver.findElement(By.tagName("input")).click();
		//driver.findElement(By.cssSelector("a#nav-logo-sprites")).click();
		
		// Tagname and Class
		//driver.findElement(By.cssSelector("a.a-button-text")).click();
		
		// Tagname and Attribute
		driver.findElement(By.cssSelector("input[aria-label='Search Amazon.in']")).click();

	}

}
