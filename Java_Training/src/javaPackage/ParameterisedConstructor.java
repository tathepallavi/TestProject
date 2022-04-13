package javaPackage;

public class ParameterisedConstructor {
	
	int id; //global variable
	String name; //global variable
	String address; //global variable
	
	// Defalut constructor
	ParameterisedConstructor(){
		System.out.println("Hello default Constructor");
		
	}
	
	// Parameterised Constructor
	ParameterisedConstructor(int a, String b, String c){
		
		id = a;
		name = b;
		address =c;
		
	}
	
	// non static method
	public void displatInfo() {
		System.out.println(id + "  " + name + "  " + address);
		
	}
	
	public static void main(String[] args) {
		
		// Default constructor calling - by directly creating an object
		ParameterisedConstructor pc = new ParameterisedConstructor();
	
		// Parameterised constructor calling - by directly creating an object
		ParameterisedConstructor pc1 = new ParameterisedConstructor(1, "Ram", "Pune");
		ParameterisedConstructor pc2 = new ParameterisedConstructor(2, "Sham", "Pune");
		pc1.displatInfo();
		pc2.displatInfo();

	}
}
