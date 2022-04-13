package javaPackage;

public class MethodOverride4 extends MethodOverride3 {
	
	public void run() {
		System.out.println("ram is running");
		
	}
	
	public static void main(String[] args) {
		MethodOverride4 mor4 = new MethodOverride4();
		mor4.run();
		
		MethodOverride3 mor3 = new MethodOverride3();
		mor3.run(); // explicitly gives output of parent class
		
	}
}
