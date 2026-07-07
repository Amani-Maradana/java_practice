package com.codegnan.collection_framework;

import java.util.Comparator;

public class SalaryNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEmpSalary()<e2.getEmpSalary()) {
			return -100;
		}
		else {
			if(e1.getEmpSalary()>e2.getEmpSalary()) {
				return +100;
			}
			else {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		}
	}

}
