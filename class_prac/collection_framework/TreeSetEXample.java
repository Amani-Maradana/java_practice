package com.codegnan.collection_framework;

import java.util.TreeSet;

public class TreeSetEXample {

	public static void main(String[] args) {
		TreeSet <Person> t = new TreeSet<>(new PersonComparator());
		t.add(new Person(111,"amani","amani@gmail.com"));
		t.add(new Person(222,"aman","aman@gmail.com"));
		t.add(new Person(333,"ama","ama@gmail.com"));
		t.add(new Person(444,"am","am@gmail.com"));
		t.add(new Person(555,"a","a@gmail.com"));
		System.out.println(t);
	}

}
