package javaPackage;

public class Inheritance4 extends Inheritance3 {
	
	public void multiply(int x, int y) {
		
		z = x * y; // Establish relation
		System.out.println("Multiplication is: " + z);
	}

	public static void main(String[] args) {
		
		int x = 20, y = 10;
		
		Inheritance4 i4 = new Inheritance4();
		
		i4.add(x, y); // taking above defined values
		i4.add(20, 15); // passing value explicitly
		i4.substract(40, 20);
		i4.multiply(x, y);
		
		
	}
	
}
