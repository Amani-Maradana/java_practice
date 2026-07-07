package com.codegnan.iostreams;

public class Person {
	private String name;
	private int age;
	private String city;

	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

public String toCSV(){
	return name+","+age+","+city;
}

}
