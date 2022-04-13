package javaPackage;

public abstract class AbstractClass1 {

	static int a = 5; // static variable
	int b = 5;
	final int c = 10;
	
	//Default constructor
	public AbstractClass1() {
		System.out.println("Hello Abstract class constructor");
		
	}
	
	// Creating Abstract method
	abstract void eat(); // no method body in abstract method
	
	// Creating non abstract method
	public void a() {
		System.out.println("Hello Non abstract method");
	}
	
}
