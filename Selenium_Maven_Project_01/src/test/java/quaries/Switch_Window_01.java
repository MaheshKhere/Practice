package quaries;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Window_01 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com");
        System.out.println("The title of parent window:" + driver.getTitle());

        ///locate career option on parent window
        WebElement career = driver.findElement(By.cssSelector("a[title='Careers']"));
        
        //scroll and click
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", career);
	    career.click();
	    driver.getWindowHandles();
	    
	    
	    Set<String> windowlist = driver.getWindowHandles();
	    Iterator<String> itr = windowlist.iterator();
	    
	    String window1=itr.next(); //parent window naukri
		String window2=itr.next(); //child window info edge
		driver.switchTo().window(window2); 

		System.out.println(driver.getCurrentUrl());
		System.out.println("The titile of window2:" + window2);
		Thread.sleep(5000);
		
		WebElement acres = driver.findElement(By.linkText("a[href='https://www.99acres.com/'"));
		acres.click();
		
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("argument[0].scrollIntoView(true);", acres);
	    
	    //switch to child tab 2
	    
	    Set<String> Windowlist2 = driver.getWindowHandles();
	    Iterator<String> itr1 = (Iterator<String>) Windowlist2.iterator();
	    String window3=itr1.next();
	    String window4=itr.next();
	    String window5=itr.next();

    driver.switchTo().window(window5);
	    
	    System.out.println(driver.getCurrentUrl());
	    System.out.println("The title of window5:"  + window5);
	    Thread.sleep(2000);
	    
	    System.out.println("The id of window3:"+ driver.getWindowHandle());
	    System.out.println("The id of window4:"+ driver.getWindowHandle());
	    System.out.println("The id of window5:"+ driver.getWindowHandle());


	}

}
