package assignments;

import java.util.TreeSet;

public class Employee_MS {
	public static void main(String[] args) {
		TreeSet <MultiSorting_Employee> ts = new TreeSet<>(new Employee_comparator());
		ts.add(new MultiSorting_Employee(111,"amani",70000));
		ts.add(new MultiSorting_Employee(222,"aman",60000));
		ts.add(new MultiSorting_Employee(333,"mani",50000));
		ts.add(new MultiSorting_Employee(444,"mani",40000));
		ts.add(new MultiSorting_Employee(555,"amani",80000));
		for(MultiSorting_Employee e :ts) {
			System.out.println(e);
		}
	}

}
