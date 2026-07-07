package com.codegnan.collection_framework;

import java.util.Comparator;

public class MyComparator implements Comparator{

	public int compare (Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return -i1.compareTo(i2);
		//String s1 = o1.toString();
		//String s2 = o2.toString();
		//return s1.compareTo(s2);
		
	}
	

}
