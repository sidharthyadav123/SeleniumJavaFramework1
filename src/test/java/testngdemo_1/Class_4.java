package testngdemo_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_4 {
	
	@Test(priority=1)
	public void accountSummary() {
		System.out.println("Account Summary Successful");
	}
	@Test(priority=2)
	public void fundTransfer() {
		System.out.println("Fund Transfer Successful");
	}
	@Test(priority=3)
	public void billPayment() {
		System.out.println(("Bill Paymenet Successful"));
	}
	
	
}
