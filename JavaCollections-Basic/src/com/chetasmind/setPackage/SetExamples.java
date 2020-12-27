package com.chetasmind.setPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {

		HashSet<String>hashSet = new HashSet<>();
		hashSet.add("red");
		hashSet.add("green");
		hashSet.add("orange");
		hashSet.add(null);
		hashSet.add("red");
		hashSet.add("blue");
		hashSet.add("green");
		
		Iterator<String>itr = hashSet.iterator();
		String str="";
		
		System.out.println("\n Display content of HashSet object. ");
		while(itr.hasNext()) {
			str = itr.next(); //In the while loop, do not write itr.next() multiple times.
			System.out.println(str);
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("red");
		linkedHashSet.add("green");
		linkedHashSet.add("orange");
		linkedHashSet.add("red");
		linkedHashSet.add("blue");
		linkedHashSet.add("green");
		
		itr = linkedHashSet.iterator();
		System.out.println("\n Display content of LinkedHashSet object.");
		
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
		TreeSet<String>treeSet = new TreeSet<>();
		treeSet.add("red");
		treeSet.add("green");
		treeSet.add("orange");
		treeSet.add("red");
		//treeSet.add(null);
		treeSet.add("blue");
		treeSet.add("green");
		
		itr = treeSet.iterator();
		System.out.println("\n Display content of TreeSet object");
		
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
	}

}
