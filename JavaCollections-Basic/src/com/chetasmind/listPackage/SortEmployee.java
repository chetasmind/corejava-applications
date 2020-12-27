package com.chetasmind.listPackage;

import java.util.ArrayList;
import java.util.Comparator;
 
class SalaryComparator implements Comparator<Employee>{
 
    @Override
    public int compare(Employee o1, Employee o2) {
         
        if(o1.getEmpSalary() > o2.getEmpSalary())
            return 1;
        else if(o1.getEmpSalary() < o2.getEmpSalary())
            return -1;
        else
            return 0;
    }
}
class NameComparator implements Comparator<Employee>{
 
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
 
public class SortEmployee {
 
    public static void main(String[] args) {
         
        ArrayList<Employee>obj = new ArrayList<>();
         
        Employee emp1 = new Employee(101,"Sagar",45000);
        Employee emp2 = new Employee(102,"Rekha",85000);
        Employee emp3 = new Employee(103,"Suhas",35000);
        Employee emp4 = new Employee(104,"Kavya",80000);
          
        obj.add(emp1);
        obj.add(emp2);
        obj.add(emp3);
        obj.add(emp4);
         
        System.out.println("Displaying Arraylist element before sorting");
        for(int i=0;i<obj.size();i++) {
            System.out.println(obj.get(i));
        }
         
        String compareUsing = "salary";
         
        if(compareUsing.equals("salary"))
            obj.sort(new SalaryComparator());
        else
            obj.sort(new NameComparator());
         
        System.out.println("Displaying Arraylist element after sorting");
        for(int i=0;i<obj.size();i++) {
            System.out.println(obj.get(i));
        }
 
    }
 
}
