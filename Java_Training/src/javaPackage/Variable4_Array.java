package javaPackage;

public class Variable4_Array {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 100}; // int Array
		
		String b[] = {"Ram", "Shyam"};  // String Array //here b[0]=Ram and b[1]=Shyam
		
		char c[] = {'a', 'b', 'c'};  // char Array
		
		System.out.println(b[0]);  // Ram
		System.out.println(a[3]);  // 4
		System.out.println(a[0]);  // 1
		System.out.println(a[5]);  // 100
		System.out.println(a[4]);  // 5
		System.out.println(c[0]);  // a
		System.out.println(c[2]);  // c
		
		// To store mixed type of values 
		Object d[] = {1, 2, 3, "Ram", "Shyam", 'a'};  
		
		System.out.println(d[0]);  // 1
		System.out.println(d[3]);  // Ram
		System.out.println(d[5]);  // a
		
		System.out.println(d[7]); // ArrayIndexOutOfBoundsException
		
		
	}

}
