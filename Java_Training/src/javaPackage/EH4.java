package javaPackage;

public class EH4 {

	public static void main(String[] args) {
		
		// not assigning value to string - null pointer exception
		String s = null;
		
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception Handled");
	}

}
