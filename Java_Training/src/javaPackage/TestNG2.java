package javaPackage;

import org.testng.Assert;
import org.testng.annotations.*;


// using Assert class in TestNG for verification and validation
public class TestNG2 {
	
	@Test
	public void assertionCheck() {
		
		String expectedMessage = "Log in";
		String actualMessage = "Lag in";
		
		Assert.assertEquals(actualMessage, expectedMessage);
		
		System.out.println("verification successful");
		
	}
}
