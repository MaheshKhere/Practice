package launch_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_003 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com");
		String s = driver.getCurrentUrl();
		System.out.println("The url of Web Page is:- " + s);

		System.out.println("The url of Web Page is:- " + driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
