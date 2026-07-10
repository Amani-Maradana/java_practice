package com.codegnan.emp.management.service;

import java.util.List;

import com.codegnan.emp.management.beans.Employee;
import com.codegnan.emp.management.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
public void addEmployee(Employee employee);
List<Employee>getAllEmployee();
public Employee getEmployeeById(int id)throws EmployeeNotFoundException;
public Employee updateEmployee (Employee employee) throws EmployeeNotFoundException;
public void deleteEmployee(int id) throws EmployeeNotFoundException;

}
