package com.codegnan.java8;
import java.util.List;
import java.util.Arrays;

public class StreamFilterMapBasicExamples {

	public static void main(String[] args) {
		List<Integer>number = Arrays.asList(10,20,30,40,50,60,70,80,90);
		List<String> names = Arrays.asList("amani","mani","aman","jahnavi");
		System.out.println("Q1 print even numbers");
		number.stream().filter(n->n%2 ==0).forEach(System.out::println);
		System.out.println("Q2: Numbers greater than 40");
		number.stream().filter(n->n>40).forEach(System.out::println);
		System.out.println("Q3: Filter names starting with A");
		names.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
		System.out.println("Q4: Names having length > 5");
		names.stream().filter(n->n.length()>5).forEach(System.out::println);
		System.out.println("Q5: Numbers divisible by 5");
		number.stream().filter(n->n%5==0).forEach(System.out::println);
		System.out.println("Q6: Names containing 'a'");
		names.stream().filter(n->n.contains("a")).forEach(System.out::println);
		System.out.println("Q7: Numbers less than 50");
		number.stream().filter(n->n<50).forEach(System.out::println);
		System.out.println("Q8: Names ending with 'i'");
		names.stream().filter(n->n.endsWith("i")).forEach(System.out::println);
		System.out.println("Q9: Number between 20 and 80");
		number.stream().filter(n->n>=20&&n<=90).forEach(System.out::println);
		System.out.println("Q10: Names with even number of characters");
		names.stream().filter(n->n.length()%2==0).forEach(System.out::println);

	}

}
