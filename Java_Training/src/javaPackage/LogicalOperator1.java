package javaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
		
		int a = 10; // local variable
		int b = 5;  // local variable
		int c = 20; // local variable
		
		//logical Operator
		System.out.println(a < b && a < c); // false
		
		//Bitwise Operator
		System.out.println(a < b & a < c); // false & true = false

	}

}
