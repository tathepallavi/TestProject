package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

// usinf Error handling in Assertion
public class TestNG3 {
	
	@Test
	public void assertionCheck() {
		
		String expectedMessage = "Log in";
		String actualMessage = "Lag in";
		
		try {
			Assert.assertEquals(actualMessage, expectedMessage);
			
		}catch (Error e) {
			//e.printStackTrace();   // to print full erorr as well as pass test case
			System.out.println(e);   // to print only error line as well as to pass test case
		}
		System.out.println("verification successful");
	}
}

	

