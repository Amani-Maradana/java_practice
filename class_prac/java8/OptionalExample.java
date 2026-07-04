package com.codegnan.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String names[] = {"amani",null,"jahnavi"};
		/*for(String n :names) {
			if(n!=null) {
				System.out.println(n.toUpperCase());
			}
			else {
				System.out.println("null value found");
			}
		}*/
		for(String n:names) {
			Optional<String>optional = Optional.ofNullable(n);
			optional.ifPresentOrElse(v ->System.out.println(v.toLowerCase()),
					()->System.out.println("null value found"));
		}

	}

}
