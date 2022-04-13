package javaPackage;

public class UnaryOperator1 {

	public static void main(String[] args) {
		
		int i = 1 ; // local variable
		
		System.out.println(i++); // 1 (current value), 2 (value will increment in background)
		
		System.out.println(i); // 2 (current incremented value)
		
		System.out.println(i++); // 2, 3
		
		System.out.println(++i); // 4 (incremented value), 4(current value)
		
		System.out.println(i);  // 4
		
		int j = i + 1; // 5
		System.out.println(j); //5
		
		System.out.println(j++); // 5, 6
		
		System.out.println(j); // 6
		
		System.out.println(++j); // 7, 7

	}

}
