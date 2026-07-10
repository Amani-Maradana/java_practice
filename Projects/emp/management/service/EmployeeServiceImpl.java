package com.codegnan.emp.management.service;

import java.util.List;

import com.codegnan.emp.management.beans.Employee;
import com.codegnan.emp.management.dao.EmployeeDaiImpl;
import com.codegnan.emp.management.dao.EmployeeDao;
import com.codegnan.emp.management.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao employeeDao = new EmployeeDaiImpl();

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.save(employee);
		System.out.println("Employee added : "+employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
		return employeeDao.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		return employeeDao.update(employee);
	}

	@Override
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		employeeDao.deleteById(id);

		
	}

}
