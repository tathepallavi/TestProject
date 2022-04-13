package javaPackage;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		// Setting properties
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
		hm.put(1, "jan");
		hm.put(2, "feb");
		hm.put(3, "mar");
		
		// Getting the values
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm); // all values

	}

}
