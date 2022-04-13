package javaPackage;

public class EH10 {

	public static void checkEligibility( int age) {
		
		// use throw for single exception
		try {
			if(age < 18) {
				throw new ArithmeticException("Invalid");	
			} else {
				System.out.println("Valid");
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	
	// use throws for multiple exception
	public static void main(String[] args) throws InterruptedException, Exception, ArithmeticException {
		Thread.sleep(3000);
		checkEligibility(15);
		checkEligibility(19);

	}
}
