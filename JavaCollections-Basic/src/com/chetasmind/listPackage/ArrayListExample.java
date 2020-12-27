package com.chetasmind.listPackage;

import java.util.ArrayList;

public class ArrayListExample {
	 
    public static void main(String[] args) {
 
    	ArrayList<String> obj = new ArrayList<String>();
         
    	obj.add("hello");
        obj.add("hi");
        //obj.add(5);
        obj.add("welcome"); 
         
        for(int i=0;i<obj.size();i++) {
            System.out.println(obj.get(i));
        }
 
    }
}