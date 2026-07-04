package com.codegnan.java8;

import java.util.function.Function;

public class StudentGradeFunctionExample {

	public static void main(String[] args) {
		Function<Student,String> f = student->{
			if(student.marks>=80) {
				return "A grade";
			}
			else if(student.marks >=60) {
				return "B grade";
			}
			else if(student.marks>= 40) {
				return "C grade";
			}
			else {
				return "fail";
			}
		};
		Student s1 = new Student("amani",89);
		Student s2 = new Student("aman",67);
		Student s3 = new Student("mani",49);
		System.out.println(s1.name+"----->"+f.apply(s1));
		System.out.println(s2.name+"----->"+f.apply(s2));
		System.out.println(s3.name+"----->"+f.apply(s3));
		

	}

}
