package com.codegnan.collection_framework;

import java.util.Comparator;

public class SalaryNameDeptComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEmpSalary()<e2.getEmpSalary()) {
			return -1;
		}
		else if(e1.getEmpSalary()>e2.getEmpSalary()) {
			return +1;
		}
		else {
			int result = e1.getEmpName().compareTo(e2.getEmpName());
			if(result !=0) {
				return result;
			}else {
				return e1.getEmpaddress().compareTo(e2.getEmpaddress());			}
		}
	}

}
