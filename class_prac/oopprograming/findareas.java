package com.codegnan.oopprograming;

public class findareas {

	public static void main(String[] args) {

		figure f = new figure (10,10);
		rectangle r = new rectangle(10,8);
		triangle t = new triangle(10,2);
		
		System.out.println("area is "+f.area());
		System.out.println("area is "+r.area());
		System.out.println("area is "+t.area());
		
	}

}
