package javaPackage;

public class UnaryOperator3 {

	public static void main(String[] args) {
		
		int a = 10; //local variable
		int b = 10; //local variable
		
		System.out.println(a++); // 10, (11)
		
		System.out.println(a++ + ++a); //11, (12) + 13, (13) = 11+13 =24
		
		System.out.println(b++ + ++b); //10, (11) + 12, (12) = 10+12 =22
		
		System.out.println(b++ + b++); //12, (13) + 13, (14) = 12+13 =25
		
		System.out.println(b); // 14
		
		System.out.println(a++ +  b++); // 13, (14) + 14, (15) = 13+14 = 27
		
		int x = 2;
		int y = x++;
				
		System.out.println(y);	//2, (3)
		System.out.println(x);  // 3  replaces value when incremented
	}

}
