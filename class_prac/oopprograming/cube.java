package com.codegnan.oopprograming;
import java.util.Scanner;
public class cube extends shape{
public void calcvolume() {
	System.out.println("side of the cube");
	Scanner sc = new Scanner(System.in);
	double side = sc.nextInt();
	double volume = Math.pow(side,3);
	System.out.printf("volume of cube : %2f\n",volume);
}
}
