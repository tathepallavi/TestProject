package javaPackage;

public class Array3 {
	
	//Passing an array to method as a argument
	
	public static void passingArrayToMethod(int a[]) {
		
		int b = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(b >= a[i]) {
				System.out.println(a[i]);
			}else
				System.out.println("b is smaller");
		}
	}

	public static void main(String[] args) {
		
		int c[] = {22, 2, 44, 5};  // defining an array
		passingArrayToMethod(c);
		

	}

}
