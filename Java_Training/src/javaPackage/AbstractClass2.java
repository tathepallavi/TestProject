package javaPackage;

public class AbstractClass2 extends AbstractClass1 {

	
	void eat() {
		System.out.println("Eating");
	
	}
	
	public static void main(String[] args) {
		
		// we cannot create object of abstract class and interface
		AbstractClass2 ac2 = new AbstractClass2();
		ac2.eat();
		ac2.a();
	}

}
