package assignments;

import java.util.Comparator;

public class Employee_comparator implements Comparator<MultiSorting_Employee>{

	public int compare(MultiSorting_Employee e1, MultiSorting_Employee e2) {
		if(e1.getSalary()<(e2.getSalary())) {
			return -1;
		}
		else if(e1.getSalary() > e2.getSalary()) {
			return +1;
		}
		else {
			return e1.getName().compareTo(e2.getName());
		}
	}

}
