package com.codegnan.oopprograming;

import java.util.Scanner;

public class employeeInfo extends employee {

	double salaryPerYear;
	
	public employeeInfo() {
		super("", "",0);
	}
	
	public void inputemployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter employee name : ");
		employename = scanner.nextLine();
		System.out.println("enter designation");
		designation = scanner.nextLine();
		System.out.println(" eanter years of experience");
		yearsOfExpreience = scanner.nextInt();
		System.out.println("enter salry per yaer ");
		salaryPerYear = scanner.nextDouble();
		
	}
	public void displayEmployeeInfo() {
		System.out.println("employee name : "+employename);
		System.out.println("desigantion : "+designation);
		System.out.println("years of experience : "+yearsOfExpreience +"years" );
	}
	public void calculatesalary() {
		double salary = salaryPerYear * yearsOfExpreience;
		System.out.println(" salary :"+salary);
	}
	
	}
