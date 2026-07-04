package com.codegnan.java8;

public class Vowelschecker {
	public interface vowelcounter {
		public Integer vowels(String s);
	}
	public static void main(String[] args) {
		vowelcounter vc = s->{
			int count = 0;
			for(char c :s.toLowerCase().toCharArray()) {
				if("aeiou".indexOf(c)!= -1) {
					count++;
				}
			}
			return count;
		};
		System.out.println("no. of vowels in Maradana Amani:");
		System.out.println(vc.vowels("MaradanaAmani"));
	}
}
