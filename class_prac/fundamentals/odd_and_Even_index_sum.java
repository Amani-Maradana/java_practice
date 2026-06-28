package com.codegnan.fundamentals;
import java.util.Scanner;
public class odd_and_Even_index_sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int size = sc.nextInt();
		int evensum =0;
		int oddsum = 0;
		int []a = new int[size];
		
		for(int i = 0;i<size;i++) {
			System.out.println("enter the "+i+" element :");
			a[i] = sc.nextInt();
		}
		
		for(int i =0;i<size;i=i+2) {
			evensum+=a[i];
		}
			System.out.println("the sum of all the even indexed elements in the array is :"+evensum);
		

		
		for(int i =1;i<size;i=i+2) {
			oddsum+=a[i];
		}
		System.out.println("the sum of all the odd indexed elements in the array is :"+oddsum);

			}

}
