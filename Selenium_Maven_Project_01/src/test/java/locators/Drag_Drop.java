package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions act = new Actions(driver);

		// ul[@id='gallery']/li/img[@src='images/high_tatras_min.jpg']
		// h5[text()='High Tatras']

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		// iframe : it is frame which is present over the webpage.

		WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras']"));

		WebElement drop = driver.findElement(By.cssSelector("div[id='trash']"));
		act.dragAndDrop(drag,drop);
	}

}
