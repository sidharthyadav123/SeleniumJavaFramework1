package testngdemo_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_3 {
	@BeforeTest
	public void login() {
		System.out.println("Login Successful");
	}
	@AfterTest
	public void logout() {
		System.out.println("Logout Successful");
	}
	@Test
	public void search() {
		System.out.println("Search Successful");
	}
	@Test
	public void advancedSearch() {
		System.out.println("Advanced Search");
	}
	@Test
	public void buyProduct() {
		System.out.println("Buying Products Successful");
	}
	
}
