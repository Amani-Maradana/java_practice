package com.codegnan.fundamentals;
import java.util.Scanner;
public class average_of_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int size = sc.nextInt();
		int [] a = new int[size];
		int sum = 0;
		for(int i = 0;i<size;i++) {
			System.out.println("enter the "+i +" element :");
			a[i] = sc.nextInt();
		}
		 for(int i =0;i<size;i++) {
			 sum +=a[i];
		 }
		 double average =0;
		 average = (sum/size);
		 System.out.println("the sum of the array elements is :"+sum);
		 System.out.println("the average of the array elements is :"+average);

	}

}
