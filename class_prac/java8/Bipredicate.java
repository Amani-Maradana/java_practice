package com.codegnan.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bipredicate {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> sum = (a,b)->(a+b)%2==0;
		System.out.println(sum.test(10,20));
		System.out.println(sum.test(15,20));
		
		BiPredicate<String,String> equal = (s1,s2) ->s1.equals(s2);
		System.out.println(equal.test("amani","amani"));
		
		BiFunction<Double,Double,Double> total = (p1,p2)->p1+p2;
		System.out.println(total.apply(32.6,2.2));

	}

}
