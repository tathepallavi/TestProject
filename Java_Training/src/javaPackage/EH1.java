package javaPackage;

public class EH1 {

	public static void main(String[] args) {
		
		try {
		int a = 20/0; // Arithmatic Exception
		}
			catch(ArithmeticException a) {
				a.printStackTrace();
				System.out.println(a);
			}
			catch(NullPointerException n) {
				System.out.println(n);
			}
		System.out.println("Exception handled");
		

	// correct approach used in industry
	try {
		int b = 10/0;  // Arithmetic Exception
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	
	finally {
		System.out.println("Finally will execute always");
		
	}

}
}