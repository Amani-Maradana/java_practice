package com.codegnan.oopprograming;

public class rectangle extends figure{

	rectangle(double a, double b){
		super(a,b);
	}
	public double area() {
		System.out.println("inside area for rectangle ");
		return dim1*dim2;
	}
}
