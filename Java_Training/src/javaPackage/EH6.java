package javaPackage;

public class EH6 {

	public static void main(String[] args) {
		
		//Array index out of bound Exception
		int a[] = new int[5];
		try {
			a[10] = 50;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		System.out.println("Exception Handled");
	}

}
