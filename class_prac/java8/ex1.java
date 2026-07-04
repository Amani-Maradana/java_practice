package com.codegnan.java8;

public class ex1 {
	public interface circleArea{
		double calculate(int r);
	}
	public static void main(String [] args) {
		circleArea c = r->(3.14)*r*r;
		System.out.println(c.calculate(5));
	}

}
