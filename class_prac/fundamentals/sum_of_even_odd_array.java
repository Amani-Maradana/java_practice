package com.codegnan.fundamentals;
import java.util.Scanner;
public class sum_of_even_odd_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size = sc.nextInt();
		int [] a = new int[size];
		
		for(int i = 0;i<size;i++) {
			System.out.println("enter the "+i+" element :");
			a[i] = sc.nextInt();
		}
		
		int evensum = 0;
		int oddsum = 0;
		for(int i =0; i<size;i++) {
			if(a[i]%2 == 0) {
				evensum += a[i];
			}
			else {
				oddsum +=a[i];
			}
		}
		System.out.println("the sum of even numbers in array is :" +evensum);
		System.out.println("the sum of odd numbers in array is :" +oddsum);

	}

}
