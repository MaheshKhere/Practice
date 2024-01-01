package testng;

import org.testng.annotations.Test;

import base_Class.Base_Test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TNG_SCript_003 extends Base_Test{
	public Actions act;
  @Test
  public void Verify_Mouse_Hover_001() {
	  act = new Actions(driver);
	  WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
	  act.moveToElement(men).build().perform();
  }
  
  @Test
  public void Verify_Mouse_Hover_002() {
	  act = new Actions(driver);
	  WebElement kid = driver.findElement(By.xpath("//span[text()='Kids']"));
       act.moveToElement(kid).build().perform();
  }
  
  @Test
  public void Verify_Mouse_Hover_003() {
	  act = new Actions(driver);
	  WebElement homeandKitchen = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
       act.moveToElement(homeandKitchen).build().perform(); 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	  launchBrowser("chrome");
	  NavigateUrl("https://www.meesho.com/");
	  
  }

}
