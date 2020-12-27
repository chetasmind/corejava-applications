package com.chetasmind.mapPackage;

import java.util.HashMap;

public class HashMapTest {
	 
    public static void main(String[] args) {
         
        Employee emp1 = new Employee(101, "Ramesh", 85000);
        Employee emp2 = new Employee(102, "Sagar", 65000);
        Employee emp3 = new Employee(103, "Swati", 25000);
        Employee emp4 = new Employee(101, "Ramesh", 85000);
         
        HashMap<Employee,String>obj = new HashMap<>();
        obj.put(emp1, "value1");
        obj.put(emp2, "value2");
        obj.put(emp3, "value3");
        obj.put(emp4, "value4");
     
        System.out.println(obj.size()); 
    }
}
