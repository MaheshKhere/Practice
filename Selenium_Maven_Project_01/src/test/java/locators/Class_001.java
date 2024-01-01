package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_001 {

	public static void main(String[] args) throws Exception {
		
		// iframe.demo-frame
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/");
		
		WebElement Frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(0);
		
		Actions act = new Actions (driver);
		WebElement slider = driver.findElement(By.cssSelector("div[id='slider']"));
		Thread.sleep(3000);
		
		act.clickAndHold(slider).moveByOffset(50, 0).release().build().perform();
		Thread.sleep(3000);
		
		act.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();
		driver.switchTo().defaultContent();
		
		
		
		 
	}

}
