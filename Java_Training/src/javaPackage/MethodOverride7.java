package javaPackage;

public class MethodOverride7 {
	
	public static void main(String[] args) {
		 // Assign parent class reference to clild class object - Dynamic method dispatch
		
		MethodOverride5 mor5 = new MethodOverride6(); // we can pass reference of parent class only
		mor5.cook();
		mor5.eat();
	}

}
