package javaPackage;

public class Static4 {

	public static void main(String[] args) {
		
		Static3 s3 = new Static3(1, "Ram"); // creating object of class Static3
		Static3 s4 = new Static3(2, "Dam");
		Static3 s5 = new Static3(3, "Pam");
		
		Static3.college = "DYP"; // calling static data inside static method directly98
		
		s3.getResult();
		s4.getResult();
		s5.getResult();

		
	}

}
