package com.chetasmind.listPackage;

import java.util.ArrayList;


public class UserDefinedObjectInArrayList {

	 public static void main(String[] args) {
		 
	        ArrayList<Employee> obj = new ArrayList<>();
	         
	        Employee emp1 = new Employee(101,"Sagar",45000);
	        Employee emp2 = new Employee(102,"Rekha",85000);
	        Employee emp3 = new Employee(103,"Suhas",35000);
	        Employee emp4 = new Employee(104,"Suhas",35000);
	          
	        obj.add(emp1);
	        obj.add(emp2);
	        obj.add(emp3);
	        obj.add(emp4);
	         
	        Employee resultObj;
	         
	        for(int i=0;i<obj.size();i++) {
	             
	            resultObj = obj.get(i);
	            System.out.println(resultObj);
	        }
	 
	    }

}
