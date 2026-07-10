package com.codegnan.emp.management.dao;

import java.util.List;

import com.codegnan.emp.management.beans.Employee;
import com.codegnan.emp.management.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {
public void save(Employee employee);
public List<Employee>findAll();
public Employee findById(int id) throws EmployeeNotFoundException;
public Employee update(Employee employee)throws EmployeeNotFoundException;
public void deleteById(int id) throws EmployeeNotFoundException;
}
