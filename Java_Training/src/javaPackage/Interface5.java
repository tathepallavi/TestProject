package javaPackage;

// multiple inheritance
public class Interface5 implements Interface3, Interface4 {

	
	public void b() {
		System.out.println(" b method ");
		
	}

	
	public void a() {
		System.out.println(" a method ");
	
	}
	
	public static void main(String[] args) {
		
		Interface5 if5 = new Interface5();
		if5.a();
		if5.b();
	}

}
