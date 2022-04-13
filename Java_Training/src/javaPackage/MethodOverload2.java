package javaPackage;

// passing different set of parameters
public class MethodOverload2 extends MethodOverload1 {
	public static void main(String[] args) {
		
		MethodOverload2 mo2 = new MethodOverload2();
		
		mo2.sum(25, 30);
		mo2.sum(10, 5, 20);
	}

}
