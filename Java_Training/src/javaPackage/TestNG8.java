package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

// Dependent Tests 
public class TestNG8 {
	
	@Test
	public void z() {
		System.out.println("z method");
		
		Assert.assertTrue(3 > 12);
		System.out.println("Z test method");
	}
	
	@Test(dependsOnMethods = {"z"})
	public void b() {
		System.out.println("b method");
	}
}
