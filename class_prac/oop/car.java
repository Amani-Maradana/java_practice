package com.codegnan.oop;
import java.util.Scanner;
public class car {
private String model;
private int year;
public car(String model, int year) {
	super();
	this.model = model;
	this.year = year;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public static void main(String[] args) {
	car c1 = new car("totyota camry",2020);
	Scanner sc= new Scanner(System.in);
	String uermodel = sc.nextLine();
	c1.setModel(uermodel);
	int useryear = sc.nextInt();
	c1.setYear(useryear);
	System.out.println( " model : "+c1.getModel());
	System.out.println("year : "+c1.getYear());
	sc.close();
	
}

}
