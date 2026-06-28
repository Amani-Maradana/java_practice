package com.codegnan.oop;

public class employeeTest {

	public static void main(String[] args) {
		employee emp = new employee();
		
		emp.setdetails("amani", 10000);
		double grosssalary = emp.grosssalary();
		System.out.println("employee name : "+emp.name);
		System.out.println("employee salary : "+emp.basicsalary);
		System.out.println("HRA allowance : "+emp.calculatehra());
		System.out.println("DA allowance : "+emp.calculateda());
		System.out.println("gross salary : "+emp.grosssalary());

	}

}
