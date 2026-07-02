package com.codegnan.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Person,Integer> h = new HashMap<>();
		h.put(new Person(1,"amani","amani@gmail.com"), 1067);
		h.put(new Person(2,"aman","aman@gmail.com"), 67);
		h.put(new Person(3,"mani","mani@gmail.com"), 60);
		System.out.println(h);
		System.out.println("printing hashmap entities one by one");
		for(Map.Entry<Person, Integer>entry:h.entrySet()) {
			System.out.println(entry.getKey()+"----->"+ entry.getValue());
		}
		
		LinkedHashMap<Person,Integer> h1 = new LinkedHashMap<>();
		h1.put(new Person(1,"amani","amani@gmail.com"), 1067);
		h1.put(new Person(2,"aman","aman@gmail.com"), 67);
		h1.put(new Person(3,"mani","mani@gmail.com"), 60);
		System.out.println(h1);
		System.out.println("printing linkedhashmap entries one by one ");
		for(Map.Entry<Person,Integer>entry : h1.entrySet()) {
			System.out.println(entry.getKey()+ "----->"+entry.getValue());
		}
		
		TreeMap<Person,Integer> h2 = new TreeMap<>(new MyComparator());
		h2.put(new Person(1,"amani","amani@gmail.com"), 1067);
		h2.put(new Person(2,"aman","aman@gmail.com"), 67);
		h2.put(new Person(3,"mani","mani@gmail.com"), 60);
		System.out.println("h2");
		System.out.println("printing values using treemap one by one :");
		for(Map.Entry<Person, Integer>e : h2.entrySet()) {
			System.out.println(e.getKey()+"----->"+e.getValue());
		}
		
		

	}

}
