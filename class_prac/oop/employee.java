package com.codegnan.oop;

public class employee {
String name;
double basicsalary;

public void setdetails(String n, double salary) {
	name = n;
	basicsalary = salary;
}

public double calculatehra() {
	return 0.20*basicsalary;
} 

public double calculateda() {
	return 0.10*basicsalary;
} 
public double grosssalary() {
	return basicsalary + calculatehra()+ calculateda();
}

}

