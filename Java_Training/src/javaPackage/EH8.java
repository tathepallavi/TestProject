package javaPackage;

public class EH8 {

	public static void main(String[] args) {

		try {
			int i = 10/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally will always execute");
		}
		
	}

}
