package javaPackage;

public class Static5 {
	
	static int z = 5; // static variable
	int y = 1; // global variable

	// static method
	public static void a() {
		z =10;  // local variable
		System.out.println(z);
	}
	
	// Non-static method
	public void b() {
		z= 15; // local variable
		System.out.println(z);
		a(); // can call static method directly

	}
	
	public static void main(String[] args) {
		a(); // can call static method directly
		
		Static5 s5 = new Static5();
		s5.b();  // Need to create object to call non static method
		
		
	}
}
