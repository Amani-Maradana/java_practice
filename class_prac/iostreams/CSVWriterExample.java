package com.codegnan.iostreams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWriterExample {

	public static void main(String[] args) {
		List <Person> people  = new ArrayList<>();
		people.add(new Person("amani",22,"vizag"));
		people.add(new Person("mani",42,"hyd"));
		people.add(new Person("aman",32,"bng"));
		people.add(new Person("amani sai",25,"delhi"));
		try(PrintWriter out = new PrintWriter("people.csv")){
			out.print("name,age,city");
			out.println();
			for(Person person:people) {
				System.out.println(person.toCSV());
			}
			System.out.println("successful");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
