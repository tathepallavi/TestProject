package javaPackage;

public class MethodOverload8 {

// Ambiguity issue resolved (it will always consider lower memory consuming data type first i.e. int )	
public void sum(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public void sum(long a, long b) {
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		MethodOverload8 mo8 = new MethodOverload8();
		mo8.sum(20, 20); 
		
	}

}
