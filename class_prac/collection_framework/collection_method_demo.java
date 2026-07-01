package com.codegnan.collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection_method_demo {

	public static void main(String[] args) {
		Collection <String>fruits = new ArrayList<>();
		System.out.println("----------------------add()--------------------------");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("orange");
		//fruits.add(true);
		//fruits.add(null);
		//fruits.add(10.5);
		System.out.println("fruits after add () :"+fruits);
		System.out.println("------------------------------addAll()----------------------------");
		Collection<String> morefruits = new ArrayList<>();
		morefruits.add("Mango");
		morefruits.add("pineapple");
		morefruits.add("cherry");
		morefruits.add("papaya");
		fruits.addAll(morefruits);
		System.out.println("fruits after adding addAll() :"+fruits);
		System.out.println("--------------------------------------remove()---------------------------------");
		fruits.remove("banana");
		System.out.println("fruits after removing banana : "+fruits);
		Collection<String> removeList = new ArrayList<String>();
		removeList.add("Mango");
		removeList.add("pineapple");
		removeList.add("cherry");
		fruits.removeAll(removeList);
		System.out.println("fruits after removing mango, pineapple, cherry : "+fruits);
		System.out.println("----------------------------------retainAll()------------------------------------------");
		Collection<String>retainList = new ArrayList<>();
		retainList.add("apple");
		retainList.add("kiwi");
		retainList.add("orange");
		fruits.retainAll(retainList);
		System.out.println("Fruits after retainall() "+fruits);
		System.out.println("-----------------------contains()----------------------------");
		System.out.println("contains apple "+fruits.contains("apple"));
		System.out.println("--------------------containsAll()------------------------");
		Collection<String>	checkList = new ArrayList<>();
		checkList.add("apple");
		checkList.add("papaya");
		System.out.println("contains all ()apple,papaya "+fruits.containsAll(checkList));
		System.out.println("-----------------------size()-----------------------");
		System.out.println("number os elements : "+fruits.size());
		System.out.println("-------------------isempty()---------------------------");
		System.out.println("is collectio empty "+fruits.isEmpty());
		System.out.println("-------------------------to array()--------------------------------");
		Object [] fruitArray = fruits.toArray();
		for(int i = 0;i<fruitArray.length;i++) {
			System.out.println(fruitArray[i]+ " ");
		}
		System.out.println();
		System.out.println("/n ----------------------------iterator() -----------------------------------");
		System.out.println("iterating using iterator : ");
		Iterator <String> itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n\n-----------------------clear() ----------------------------------");
		fruits.clear();
		System.out.println("fruits after clear : "+fruits);
		System.out.println("is collection empty after clear : "+fruits.isEmpty());
		
		}
		
	}
