package javaPackage;

// always gives output of child class as it gives runtime output
public class MethodOverride2 extends MethodOverride1 {
		public void eat() {
		
		System.out.println("u are eating");
		
	}
		
		public static void main(String[] args) {
			
			MethodOverride2 mor2 = new MethodOverride2();
			mor2.eat();
		}

}
