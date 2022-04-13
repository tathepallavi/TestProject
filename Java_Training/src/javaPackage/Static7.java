package javaPackage;

public class Static7 {
	
	String a; // global variable
	int b;  // global variable
	
	static int c = 4; // static variable
	
	public static void a() {
		System.out.println("Hello static");
	}

	public static void main(String[] args) {
		
		Static7 s7 = new Static7();
		
		s7.a = "Selenium";
		s7.b = 1;
		
		c = 2; // modifying value of c
		a();
		
		System.out.println(s7.a + "  " + s7.b + "  " + c);
	}

}
