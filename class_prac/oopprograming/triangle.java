package com.codegnan.oopprograming;

public class triangle extends figure {
triangle (int a, int b){
	super(a,b);
}
public double area() {
	System.out.println("inside area of trinagle");
	return (dim1*dim2)/2;
}
}
