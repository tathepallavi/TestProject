package javaPackage;

import org.testng.annotations.*;

// Parallel Test execution
public class TestNG9 {
	
	@Test
	public void a() {
		System.out.println("a method " +Thread.currentThread().getId());  
	}

	@Test
	public void b() {
		System.out.println("b method " +Thread.currentThread().getId());
	}
}
