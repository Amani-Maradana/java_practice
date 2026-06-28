package com.codegnan.oopprograming;

import java.util.Scanner;

public class cuboid extends shape{
	public void calcvolume() {
		Scanner sc = new Scanner(System.in);
		System.out.println("length of cuboid :");
		double length = sc.nextDouble();
		System.out.println("width of cuboid :");
		double width = sc.nextDouble();
		System.out.println("height of the cuboid  :");
		double height = sc.nextDouble();
		
		double volume = length*width*height;
		System.out.printf("volume of the cuboid : %.2f\n",volume);
	}

}
