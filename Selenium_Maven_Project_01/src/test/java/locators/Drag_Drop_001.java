package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_001 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		// driver.get("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		// (By.xpath("//h5[text()='High Tatras']")
		WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras']"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		act.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();

	}

}
