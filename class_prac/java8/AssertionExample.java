package com.codegnan.java8;

public class AssertionExample {

	public static void main(String[] args) {
		int studentage = 20;
		assert(studentage>30):"age should be less than 20";
		System.out.println("valid student age : "+studentage);

	}

}
