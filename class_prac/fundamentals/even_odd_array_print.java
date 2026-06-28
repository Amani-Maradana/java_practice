package com.codegnan.fundamentals;
import java.util.Scanner;

public class even_odd_array_print extends Object{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int size = sc.nextInt();
		int []a = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("enter the " + i + " element");
			a[i] = sc.nextInt();
		}
		
		System.out.print("even numbers are :");
		for(int i = 0; i < size; i++) {
			if(a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("odd numbers are :");
		for(int j = 0; j < size; j++) {
			if(a[j] % 2 != 0) {
				System.out.print(a[j] + " ");
			}
		}
		System.out.println(); 
		
		sc.close();
	}


}
