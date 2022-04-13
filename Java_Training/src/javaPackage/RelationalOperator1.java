package javaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		
		int a = 300; // local variable
		int b = 300; // local variable
		
		if(a != b) {
			System.out.println("a is not equal to b");
		} else
			System.out.println("a and b are equal");
			
		String p = "HeLlo SElenium";
		String q = "Hello Selenium";
		
		//...........String comparison - 1st way - not correct................
		// we always use == for number comparison
		if(p == q) {
			System.out.println("p and q are equal for 1st way");
		} else {
			System.out.println("p and q are not equal for 1st way");
		}
		
		
		//.......String comparison - 2nd way - not appropriate (but can be used)...........
		// equals() function is case sensitive
		if(p.equals(q)) {
			System.out.println("p and q are equal for 2nd way");
		} else {
			System.out.println("p and q are not equal for 2nd way");
		}
		
		
		//..........String comparison - 3rd way - correct................ 
		// equalsIgnoreCase() function is not case sensitive, will ignore case sensitivity
		if(p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal for 3rd way");
		} else {
			System.out.println("p and q are not equal for 3rd way");
				}
		
	}

}
