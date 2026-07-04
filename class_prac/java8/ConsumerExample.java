package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer <String> c = s-> System.out.println(s);
		c.accept("Hello java");
		Consumer<Integer> b = n -> System.out.println("Square: "+n*n);
		b.accept(5);
		Consumer<String> t = n ->System.out.println(n.toUpperCase());
		t.accept("amani");
		List<String> l = Arrays.asList("amani","jahnavi");
		Consumer<String>d = n ->System.out.println("Language : "+n);
		l.forEach(d);
		
		
		
	}

}
