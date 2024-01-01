package launch_browser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Luanch_Browser {

	public static void main(String[] args) throws Exception {
		
		// To Invoke Chrome Browser
		
		//ChromeDriver driver = new ChromeDriver();
		
		// To maximize window
		//driver.manage().window().maximize();
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		 
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 // To hit url on browser
		 driver.get("https://www.amazon.in");
		 
		 // to click search box
		 //driver.findElement(By.id("twotabsearchtextbox")).click();
		 //driver.findElement(By.id("twotabsearchtextbox")).click();
		 
		 // To click on All 
		 //driver.findElement(By.name("url")).click();
		// driver.findElement(By.className("nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown")).click();
		 
		 // To click on link
		 //driver.findElement(By.linkText("Amazon miniTV")).click();
		// driver.findElement(By.partialLinkText("miniTV")).click();
		 
		 //driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
		 
		 //driver.findElement(By.cssSelector("a.a-button-text")).click();
		 
		 driver.findElement(By.cssSelector("a[id='nav-logo-sprites']")).click();
		 
	
		
		

	}

}
