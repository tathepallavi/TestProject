package javaPackage;

public class Static6 {
	
	int x = 10; // global variable
	static int y = 5; // static variable
	
	// Non-static method
	public void a() {
		int z = 10; // local variable
		System.out.println(z);
		
	}
	
	static int b = 6; // static variable
	
	
	//Static method
	public static void b() {
		
		int a = 5; // local variable
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		
		Static6 s6 = new Static6();
		s6.a(); // calling non static method with the help of object reference
		System.out.println(s6.b); // calling static member with object ref is not appropriate
		System.out.println(Static6.b); //appropriate
		System.out.println(b); //correct way directly calling
		
		
	}

}
