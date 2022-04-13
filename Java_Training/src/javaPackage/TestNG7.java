package javaPackage;

import org.testng.annotations.*;

public class TestNG7 {
	
	@Test
	public void a() {
		System.out.println("a method");
	}
	
	@Test(invocationCount = 2, priority = -1, enabled = false)
	public void b() {
		System.out.println("b method");
	}
	
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c method");
	}
	
	@Test
	public void d() {
		System.out.println("d method");
	}

	@BeforeMethod
	public void e() {
		System.out.println("e method");
	}
}
