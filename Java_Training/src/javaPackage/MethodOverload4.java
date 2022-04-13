package javaPackage;

//can call function directly without creating object, as we are calling static function 
public class MethodOverload4 extends MethodOverload3 {

	public static void main(String[] args) {
		
		System.out.println(add(10,5));
		System.out.println(add(10,5,20));

	}

}
