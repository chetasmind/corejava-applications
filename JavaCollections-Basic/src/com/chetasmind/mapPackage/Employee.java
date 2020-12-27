package com.chetasmind.mapPackage;

public class Employee {
    
    private int empID;
    private String empName;
    private double empSalary;
     
    public Employee() {
         
    }
    public Employee(int empID,String empName,double empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empSalary = empSalary;
    }
     
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
     
    @Override
    public String toString() {
         
        String empDetails = "Employee ID: "+this.empID+" Employee Name: "+this.empName+" Salary="+this.empSalary; 
        return empDetails;
         
    }
     
    @Override
    public int hashCode() {
         
        return (empID+empName.hashCode());
             
    }
     
    public boolean equals(Object obj) {
         
        if(obj instanceof Employee) {
            Employee emp = (Employee)obj;
            if(this.empID==emp.empID && this.empName.equals(emp.empName) && (this.empSalary==emp.empSalary))
                return true;
        }
        return false;
    }
}
