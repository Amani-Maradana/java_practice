package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodsDemo {

	public static void main(String[] args) {
		Map <String,Integer>studentmarks = new HashMap<>();
		studentmarks.put("amani", 89);
		studentmarks.put("aman", 79);
		studentmarks.put("mani", 67);
		studentmarks.put("hari", 89);
		studentmarks.put("janu", 95);
		Map <String,Integer> newstudents = new HashMap<>();
		newstudents.put("jahnavi",98);
		newstudents.put("mahesh",58);
		newstudents.put("chalam",78);
		studentmarks.putAll(studentmarks);
		System.out.println(studentmarks);
		System.out.println("marks of amani :"+studentmarks.get("amani"));
		System.out.println("removed janu marks :"+studentmarks.remove("janu"));
		System.out.println("is chalam present : "+studentmarks.containsKey("chalam"));
		System.out.println("any students scored 100 : "+studentmarks.containsValue(100));
		System.out.println("is map empty ? : "+studentmarks.isEmpty());
		System.out.println("total students : "+studentmarks.size());
		Set<String> studentnames = studentmarks.keySet();
		System.out.println("student names : "+studentnames);
		Collection<Integer> marks = studentmarks.values();
		System.out.println("Student marks : "+studentmarks.values());
		Set<Map.Entry<String, Integer>>entries = studentmarks.entrySet();
		System.out.println("all entries");
		for(Map.Entry<String, Integer>entry:entries) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		studentmarks.clear();
		System.out.println("Map is empty ? "+studentmarks.isEmpty());
	}

}
