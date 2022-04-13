package javaPackage;


//One class can inherit only one other class using extends keywor, but it can inherit multiple interface using implements keyword
public class Interface6 extends Inheritance1 implements Interface3, Interface4 {
	
	public void b() {
		System.out.println(" b method ");
		
	}

	
	public void a() {
		System.out.println(" a method ");
	
	}
	
	public static void main(String[] args) {
		
		Interface6 if6 = new Interface6();
		if6.a();
		if6.b();
		System.out.println(if6.roll);
		
	}

}
