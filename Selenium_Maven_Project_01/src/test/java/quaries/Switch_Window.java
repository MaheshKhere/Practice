package quaries;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Switch_Window {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://naukri.com");

		System.out.println("The Title of Parent Tab is:- "+driver.getTitle());
		WebElement career = driver.findElement(By.xpath("//*[@href='http://careers.infoedge.in/']"));
		
		// Scroll And Click on Link
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", career);
		career.click();

		Set<String> tab_1 = driver.getWindowHandles();
		Iterator<String> it_1 = tab_1.iterator();
		String parent_Tab_id_1 = it_1.next();
		String child_Tab_id_1 = it_1.next();

		// Switch to Child Tab-1
		driver.switchTo().window(child_Tab_id_1);
		System.out.println("The Title of Child Tab-1 is:- " + driver.getTitle());
		System.out.println("Parent Window id:- " + parent_Tab_id_1);
		System.out.println("Child-1 Window id:- " + child_Tab_id_1);

		System.out.println("------------------------------------------------------------------");
		
		// Scroll Page and Click on acres link
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,750)");
		
		driver.findElement(By.linkText("99acres.com")).click();

		// Switch to Child Tab-2
		Set<String> tab_2 = driver.getWindowHandles();
		Iterator<String> it_2 = tab_2.iterator();
		String parent_tab_2 = it_2.next();

		String child_Tab_id_2 = it_2.next();
		String child_Tab_id_3 = it_2.next();
		driver.switchTo().window(child_Tab_id_3);
		
		System.out.println("The Title of Tab-2 is :- " +driver.getTitle());
		System.out.println("Child-2 Tab Window id is:- " +child_Tab_id_3);
		
	}

}
