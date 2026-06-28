package com.codegnan.oopprograming;

public class figure {

	double dim1;
	double dim2;
	public figure(double dim1, double dim2) {
		super();
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	//overridden method
	public double area() {
		System.out.println("area for figure undefined");
		return 0;
	}
	
}
