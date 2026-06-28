package com.codegnan.oop;

public class overloadDemo {

	void test() {
		System.out.println("no parameters");
	}
	void test(int a,int b) {
		System.out.println("a and b is " +a+""+ b);
	}
	void test(double a) {
		System.out.println("inside test(double)a "+a);
		
	}
	
	public static void main(String[] args) {
		overloadDemo od = new overloadDemo();
		od.test();
		od.test(10,20);
		od.test(12.7);

	}

}
