package javaPackage;

//without extending Class we can directly use properties of other class by using static keyword 
public class MethodOverload6 {

	public static void main(String[] args) {
		
		System.out.println(MethodOverload5.add(10, 5));
		System.out.println(MethodOverload5.add(10.5, 5.5));
	}

}
 