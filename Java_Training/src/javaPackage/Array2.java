package javaPackage;

public class Array2 {

	public static void main(String[] args) {
		
		// To store mixed data type values
		Object a[] = {1,2,3,4,5,"selenium", 6.5};  // defining an object array
		
		int b[] = {1,2,3,4,5};  // defining an integer array
		
		String s[] = {"Hi", "Hello"};  // defining an string array
		
		System.out.println(a.length); // 7
		System.out.println(b.length); // 5
		System.out.println(s.length); // 2
		
		System.out.println(a[5]); // selenium
		System.out.println(b[4]); // 5
		System.out.println(s[1]); // Hi
		
		a[5] = "Automation";  // Modifying Array value using index
		System.out.println(a[5]);
		

	}

}
