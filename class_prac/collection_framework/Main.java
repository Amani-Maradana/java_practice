package com.codegnan.collection_framework;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		// TreeSet<String> names = new TreeSet<>();
		//Set<String> names = new LinkedHashSet<>();
		names.add("amani");
		names.add("mani");
		names.add("aman");
		names.add("janu");
		System.out.println(names);
		for(String n :names) {
			System.out.println(n);
		}

	}

}
