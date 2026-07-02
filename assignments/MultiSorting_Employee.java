package assignments;

import java.util.Objects;

public class MultiSorting_Employee {
	private int id;
	private String name;
	private int salary;
	public MultiSorting_Employee() {
		super();
	}
	public MultiSorting_Employee(int id,String name,int salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}
	@Override
	public String toString() {
		return "MultiSorting_Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MultiSorting_Employee other = (MultiSorting_Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}
	
	

}
