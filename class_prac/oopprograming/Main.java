package com.codegnan.oopprograming;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		Integer x = a; // autoboxing primitive to wrapper class object
		System.out.println("Primitive value a "+a);
		System.out.println("Wrapper value x : "+x);
		
		Long l = 189809809l;
		long y = l;//unboxing wrapper to primitive
		System.out.println("Wrapper class long value l :"+l);
		System.out.println("Primitive long value : "+y);
	}

}
