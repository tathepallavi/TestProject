package javaPackage;

public class Array4 {

	public static void main(String[] args) {
		
		// Definition of multi dimensional array
		
		int a[][] = {{1,2,5,9},{2,9,5,4},{1,6,7,3}};
		
		// total rows 
		int row = a.length; 
		System.out.println("Total rows: " + row);  // 3
		
		// Total columns
		int column = a[0].length; 
		System.out.println("Total column: " + column); // 4
		
		// Print all data from multi dimensional array
		
		//outer loop
		for(int i = 0; i < row; i++) {
			
			//inner loop
			for(int j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
