package com.codegnan.fundamentals;
import java.util.Scanner;
public class fibonacci_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of terms of fibonacci series");
		int num_term = sc.nextInt();
		int firstterm = 0; 
		int secondterm = 1;
		
		System.out.print("fibonacci series : ");
		System.out.print(firstterm +" "+ secondterm+" ");
		for (int i=2;i < num_term; i++) {
			int nextterm = firstterm+secondterm;
			System.out.print(nextterm + " ");
			firstterm = secondterm;
			secondterm = nextterm;
		}
		sc.close();
		

	}

}
