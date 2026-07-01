package com.codegnan.collection_framework;

import java.util.ListIterator;
import java.util.ArrayList;


public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		list.add("Java");
		list.add("python");
		list.add("c");
		list.add("c++");
		ListIterator<String> itr = list.listIterator();
		System.out.println("Original list : "+list);
		System.out.println("========= forward traversal =============");
		while(itr.hasNext()) {
			System.out.println("--------------------------------------------------------");
			System.out.println("next index:"+itr.nextIndex());
			String value = itr.next();
			System.out.println("element :"+value);
			if (value.equals("python")) {
				itr.set("python 3");
				System.out.println(" python replaced by python 3");
			}
			if(value.equals("c")) {
				itr.add("SQL");
				System.out.println("Sql added ");
			}
			if(value.equals("C++")) {
				itr.remove();
				System.out.println(" c++ removed ");
			}
		}
		System.out.println(" list after forward traversal ");
		System.out.println(list);
		System.out.println(" backward traversal");
		while(itr.hasPrevious()) {
			System.out.println("---------------------------------------------------");
			System.out.println("previous index : "+itr.previousIndex());
			System.out.println("element : "+itr.previous());
		}
		System.out.println("final list : "+list);
		

	}

}
