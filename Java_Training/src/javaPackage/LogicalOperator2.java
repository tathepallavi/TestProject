package javaPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {
		
		int a = 10; // local variable
		int b = 5;  // local variable
		int c = 20; // local variable
		
		//logical Operator - check 2nd condition only if 1st condition is true
		System.out.println(a < b && a++ < c); // false
		System.out.println(a); // 10 - will not check 2nd condition
		
		//Bitwise Operator - check both condition, whether 1st is true or false
		System.out.println(a < b & a++ < c); // false & true = false
		System.out.println(a); // 11 - checks 2nd condition

	}

}
