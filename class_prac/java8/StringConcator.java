package com.codegnan.java8;

public class StringConcator {
	public interface concator {
		public String join(String a, String b);
	}
	
	public static void main(String[] args) {
		concator c = (a,b)->a+" "+b;
		System.out.println(c.join("Maradana","Amani"));
		
	}

}
