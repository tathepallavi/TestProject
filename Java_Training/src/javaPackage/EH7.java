package javaPackage;

public class EH7 {

	public static void main(String[] args) {
		
		int a[] = new int[7]; // index 0 to 6
		
		try {
			a[7] = 10/0; // two exceptions - Arithmetic exception will occur, last operation it will take
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Exception Handled");
	}

}
