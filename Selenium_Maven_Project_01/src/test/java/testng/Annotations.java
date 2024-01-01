package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite 
	public void a() {
		System.out.println("@ Before Suite");
	}

	@BeforeTest 
	public void d() {
		System.out.println("@ Before Test");
	}
	
	@BeforeClass 
	public void e() {
		System.out.println("@ Before Class");
	}
	
	@BeforeGroups
	public void j() {
		System.out.println("@ Before Group");
	}
	@Test
	public void b() {
		System.out.println("@ Test Method");
	}

	@AfterClass
	public void i() {
		System.out.println("@ After Class");
	}
	@AfterTest
	public void g() {
		System.out.println("@ After Test");
	}
	@AfterSuite
	public void c() {
		System.out.println("@After Suite");
	}
}
