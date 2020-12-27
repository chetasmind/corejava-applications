package com.chetasmind.mapPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class DifferentMapExample {

	public static void main(String[] args) {
		
		System.out.println("\n ================ HashMap Example=============");
		
		HashMap<String,String>obj = new HashMap<>();
		obj.put("Suresh", "Bangalore");
		obj.put("Rajesh", "Goa");
		obj.put(null, "Delhi");
		obj.put("Neha", "Mangalore");
		
		Set<String> set = obj.keySet();
		
		for(String person: set) {
			System.out.println();
			System.out.print("Key is :"+person);
			System.out.print("  Value is :"+obj.get(person));
		}
		
		System.out.println("\n \n ================ LinkedHashMap Example=============");
		
		LinkedHashMap<String,String> linkedObj = new LinkedHashMap<>();
		linkedObj.put("Suresh", "Bangalore");
		linkedObj.put("Rajesh", "Goa");
		linkedObj.put(null, "Assam");
		linkedObj.put("Neha", "Mangalore");
		
		set = linkedObj.keySet();
		
		for(String person: set) {
			System.out.println();
			System.out.print("Key is :"+person);
			System.out.print("  Value is :"+linkedObj.get(person));
		}
		 
		System.out.println("\n \n ================ TreeMap Example=============");
		
		TreeMap<String,String> treeMap = new TreeMap<>();
		
		treeMap.put("Suresh", "Bangalore");
		treeMap.put("Rajesh", "Goa");
		treeMap.put("Neha", "Mangalore");
		//treeMap.put(null, "Goa");  //TreeMap object will not accept null as key
		
		set = treeMap.keySet();
		
		for(String person: set) {
			System.out.println();
			System.out.print("Key is :"+person);
			System.out.print("  Value is :"+treeMap.get(person));
		}
	}

}

