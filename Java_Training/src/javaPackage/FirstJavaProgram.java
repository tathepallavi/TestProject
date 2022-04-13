package javaPackage;

public class FirstJavaProgram {
    // Double slash is used to comment line
	// shortcut to write main method - ma + ctrl + space inside class body
	public static void main(String[] args) {
	
		//shortcut to write System.out.println() - syso + ctrl + space inside method body
		
		System.out.println("Hello Selenium");
		System.out.println("123456");
		
		//calling user defined method
		aMethod();
		bMethod();
		
	}

	// User defined static method1
	public static void aMethod() {
		System.out.println("A Method");
	}
	
	// User defined static method2
	public static void bMethod() {
		System.out.println("B Method");
	}
	
}


//User defined method should always be called inside main method