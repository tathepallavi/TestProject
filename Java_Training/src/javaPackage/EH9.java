package javaPackage;

public class EH9 {

	public static void main(String[] args) {
		
		try {
			int i = 20/2; // no exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				int a = 5/0; // Exception
			}
			 catch(Exception e) {
				 e.printStackTrace();
			 }
			
			System.out.println("Finally will always execute");
		}
	}

}
