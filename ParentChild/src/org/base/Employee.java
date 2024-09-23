package org.base;

public class Employee {
public void empid() {
	System.out.println("employee id");
}
public void empName() {
	System.out.println("employee name");
}
public static void main(String[] args) {
	Employee  e= new Employee();
	e.empid();
	e.empName();
	
	Company c= new Company();
	c.compId();
	c.compName();
}
}
