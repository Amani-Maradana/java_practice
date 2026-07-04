package com.codegnan.java8;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		/*Predicate<Integer> p = a -> a % 2 ==0;
		System.out.println(p.test(20));
		Predicate <String> l = b.length()>4;
		System.out.println(l.test("amani"));
		*/
		Function<String,Integer> f = n->n.length();
		System.out.println(f.apply("amani"));
		Function<String,String> f1 = n->n.toUpperCase();
		System.out.println(f1.apply("amani"));
		Function<Integer,Double> f2 = c->(c*9/5)+32.0;
		System.out.println(f2.apply(13));

		
		

	}


}
