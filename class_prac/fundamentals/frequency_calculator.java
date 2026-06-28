package com.codegnan.fundamentals;
import java.util.Scanner;
public class frequency_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int a[] = new int[size];
		 for (int i = 0;i<size;i++) {
			 System.out.println("enter the "+i+" element :");
			 a[i] = sc.nextInt();
		 }
	  System.out.println("enter the target :");
	  int count = 0;
	  int target =sc.nextInt();
	   for(int i = 0;i<size;i++) {
		   if(a[i] == target) {
			   count++;
		   }
	   }
	   System.out.println("the frequency of "+ target +"repeated in array is :"+count);

	}

}
