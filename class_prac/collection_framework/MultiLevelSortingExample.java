package com.codegnan.collection_framework;

import java.util.TreeSet;

public class MultiLevelSortingExample {

	public static void main(String[] args) {
		TreeSet <Employee> treeset = new TreeSet<>(new SalaryNameDeptComparator());
		//TreeSet <Employee> treeset = new TreeSet<>(new SalaryNameComparator());

		treeset.add(new Employee(111,"Amani",1111,"hyd"));
		treeset.add(new Employee(222,"aman",2222,"vzg"));
		treeset.add(new Employee(333,"amani",1111,"vjd"));
		treeset.add(new Employee(444,"amu",5555,"del"));
		for (Employee e :treeset) {
			System.out.println(e);
		}

	}

}
