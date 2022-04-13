package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.*;


// Skipping Test case
public class TestNG6 {
	
	@Test
	public void a() {
		System.out.println("a method");
	}
	
	// 1. industy uses this way - Recommended
	@Test(enabled = false)
	public void b() {
		System.out.println("b method");
	}
	
	//Test case will execute 2 times
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c method");
	}
	
	// 2. Test case will execute 0 times, means test case get skipped
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("d method");
	}
	
	// 3. correct way but not recommended
	@Test
	public void e() {
		System.out.println("e method");
		throw new SkipException("skipping e method");
	}
	
	//4. commenting test case
	//@Test
	public void f() {
		System.out.println("f method");
	}
}
