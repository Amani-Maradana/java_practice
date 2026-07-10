package com.codegnan.emp.management.dao;

import java.util.ArrayList;
import java.util.List;

import com.codegnan.emp.management.beans.Employee;
import com.codegnan.emp.management.exceptions.EmployeeNotFoundException;

public class EmployeeDaiImpl implements EmployeeDao{
	private List<Employee> employeeList = new ArrayList<>();
	

	@Override
	public void save(Employee employee) {
		employeeList.add(employee);
		
	}

	@Override
	public List<Employee> findAll() {
		return employeeList;
	}

	@Override
	public Employee findById(int id) throws EmployeeNotFoundException {
		for(Employee e : employeeList) {
			if(e.getId()==id) {
				return e;
			}
		}
		throw new EmployeeNotFoundException("emploee with id :"+id+" not found");
	}

	@Override
	public Employee update(Employee employee) throws EmployeeNotFoundException {
		for(int i = 0;i<=employeeList.size();i++) {
			if(employeeList.get(i).getId() == employee.getId()) {
				employeeList.set(i, employee);
				return employee;
			}
		}
		throw new EmployeeNotFoundException ("Employee with id : "+employee.getId()+" not found");
	}

	@Override
	public void deleteById(int id) throws EmployeeNotFoundException {
		boolean found = false;
		for(int i = 0 ;i<=employeeList.size();i++) {
			if(employeeList.get(i).getId()==id) {
				employeeList.remove(i);
				found = true;
				break;
			}
		}
		if(!found) {
			throw new EmployeeNotFoundException("employee with id "+id+" not found so cant delete ");
		}
		
	}

}
