package javaPackage;

public class Static3 {
	
	int roll; // global variable
	String name; // global variable
	static String college = "Balaji"; // static variable
	
	// constructor of Static3 class
	Static3(int r, String n){  
		roll = r;
		name = n;
	}

	public void getResult() {
		System.out.println(roll + "  " + name + "  " + college);
		
	}
	
	
}
