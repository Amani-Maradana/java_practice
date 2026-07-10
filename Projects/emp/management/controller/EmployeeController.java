package com.codegnan.emp.management.controller;

import java.util.List;
import java.util.Scanner;

import com.codegnan.emp.management.beans.Employee;
import com.codegnan.emp.management.exceptions.EmployeeNotFoundException;
import com.codegnan.emp.management.service.EmployeeService;
import com.codegnan.emp.management.service.EmployeeServiceImpl;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		int choice ;
		do {
			System.out.println("||==============================================================================||");
			System.out.println("||=====================Employee management system===============================||");
			System.out.println("||===========================1. add employee====================================||");
			System.out.println("||========================2. view all employee  ================================||");
			System.out.println("||=============================3. search employee by id=========================||");
			System.out.println("||==============================4. update employee =============================||");
			System.out.println("||==============================5. delete employee =============================||");
			System.out.println("||==============================6. exit=========================================||");
			System.out.println("||==============================================================================||");
			System.out.println("enter your choice : ");
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("enter employee id : ");
				int id = scanner.nextInt();
				System.out.println("enter employee name");
				String name = scanner.nextLine();
				scanner.nextLine();
				System.out.println("enter employee salary :");
				double salary = scanner.nextDouble();
				service.addEmployee(new Employee(id,name,salary));
				break;
			case 2:
				System.out.println("=====all employees=====");
				List<Employee> employees = service.getAllEmployee();
				if(employees.isEmpty()) {
					System.out.println("no employees found");
				}
				else {
					for(Employee emp : employees) {
						System.out.println(emp);
					}
				}
				break;
			case 3:
				System.out.println("enter employee id : ");
				int searchId = scanner.nextInt();
				try {
				Employee fetchEmp = service.getEmployeeById(searchId);
				System.out.println("employee found "+fetchEmp);}
				catch(EmployeeNotFoundException e) {
					System.out.println("ERROR :"+e.getMessage());
				}
				break;
			case 4:
				System.out.println("enter employee id to update : ");
				int updateId = scanner.nextInt();
				System.out.println("enter name :");
				String updatedname = scanner.nextLine();
				System.out.println("enter employee salary : ");
				double updatedsalary = scanner.nextDouble();
				try {
				Employee updatedEmp = service.updateEmployee(new Employee(updateId,updatedname,updatedsalary));
				System.out.println("employee updates successfullly : "+updatedEmp);}
				catch(EmployeeNotFoundException e) {
					System.out.println("ERROR : "+e.getMessage());
				}
				break;
			case 5:
				System.out.println("enter id to delete : ");
				int deleteId = scanner.nextInt();
				try {
				service.deleteEmployee(deleteId);
				System.out.println("employee deleted successfully");}
				catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				System.out.println("exiting employee management system");
				break;
			default:
				System.out.println("invalid choice! try again ");
			}
}while(choice!=6);
	

	}

}
