package javaPackage;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		// Setting properties
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); 
		ht.put(1, "jan");
		ht.put(2, "feb");
		ht.put(3, "mar");
		
		// Getting the values
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get(3));
		System.out.println(ht); // all values

	}

}
