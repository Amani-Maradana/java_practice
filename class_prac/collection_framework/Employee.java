package com.codegnan.collection_framework;

import java.util.Objects;

public class Employee {
private int empId;
private String empName;
private double empSalary;
private String empaddress;
//no args constructor
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
// all argc onstructor
public Employee(int empId, String empName, double empSalary, String empaddress) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empaddress = empaddress;
}
// getter and setter methods
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public String getEmpaddress() {
	return empaddress;
}
public void setEmpaddress(String empaddress) {
	this.empaddress = empaddress;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empaddress="
			+ empaddress + "]";
}
@Override
//hashcode
public int hashCode() {
	return Objects.hash(empId, empName, empSalary, empaddress);
}
@Override
//equals
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return empId == other.empId && Objects.equals(empName, other.empName)
			&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary)
			&& Objects.equals(empaddress, other.empaddress);
}

}
