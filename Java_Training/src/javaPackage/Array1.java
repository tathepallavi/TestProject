package javaPackage;

public class Array1 {

	public static void main(String[] args) {
		
		// Declaration of an array and Instaintiation
		int a[] = new int[5]; 
		
		// Print default value of an array
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// Initialisation of an array
		a[0] = 65;
		a[3] = 10;
		a[1] = 89;
		a[2] = 5;
		a[4] = 1;
		
		//a[5] = 6; // Error:ArrayIndexOutOfBoundsException
		
		//Random access
		System.out.println(a[2]);
		
		//Print length of an array
		System.out.println("Total length = " + a.length); // length is property of an array
		
		//Print all array element
		for(int i = 0; i < a.length; i++) {
			System.out.println("Array value for index: " + i + " is " + a[i]);
	}

}
}