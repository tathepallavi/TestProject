package javaPackage;

public class EH5 {

	public static void main(String[] args) {
		
		// Converting string to integer - number format exception
		String y = "Selenium";
		String x = "Hello";
		
		try {
			int i = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception Handled");
	}

}
