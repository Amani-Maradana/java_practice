package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;

public class StreamMapBasicExamples {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
		List<String> names = Arrays.asList("amani", "mani", "aman", "jahnavi");
		
		System.out.println("Q1: Multiply each number by 2");
		number.stream().map(n->n*2).forEach(System.out::println);
		System.out.println("Q2: Adding 10 to each number");
		number.stream().map(n->n+10).forEach(System.out::println);
		System.out.println("Q3: Convert numbers to String");
		number.stream().map(n->"value "+n).forEach(System.out::println);
		System.out.println("Q4: Square of each number");
		number.stream().map(n->n*n).forEach(System.out::println);
		System.out.println("Q5: Convert names to uppercase");
		names.stream().map(n->n.toUpperCase()).forEach(System.out::println);
		System.out.println("Q6: Convert names to lowercase");
		names.stream().map(n->n.toLowerCase()).forEach(System.out::println);
		System.out.println("Q7: Get length of each name");
		names.stream().map(n->n.length()).forEach(System.out::println);
		System.out.println("Q8: Add 18% GST to each number");
		number.stream().map(n->n+n*(0.18)).forEach(System.out::println);
		System.out.println("Q9: check wether the no. of characters are even or odd");
		names.stream().map(n->n+(n.length()%2==0?" is even":" is odd")).forEach(System.out::println);

	}

}
