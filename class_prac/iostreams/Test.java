package com.codegnan.iostreams;

public class Test {

	public static void main(String[] args) {
		PopCorn p = new PopCorn() {
			public void taste() {
				System.out.println("salty");
			}
		};
		p.taste();
		PopCorn p1 = new PopCorn();
		p1.taste();
		PopCorn p2 = new PopCorn() {
			public void taste() {
				System.out.println("sweet");
			}
		};
		System.out.println();
		System.out.println();

	}

}
