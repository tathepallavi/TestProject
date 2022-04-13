package javaPackage;

public class Static2 {
	
	int roll; // global variable
	String name; // global variable
	String college; // global variable

	public static void main(String[] args) {
		
		Static2 s2 = new Static2(); // for calling non static data into static method we create object of class
		
		System.out.println(s2.roll); // 0 (Default value of integer)
		System.out.println(s2.name); // null (Default value of String)
		System.out.println(s2.college); // null (Default value of String)


	}

}
