package com.codegnan.fundamentals;
import java.util.Scanner;
public class largest_smallest_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int size = sc.nextInt();
		int [] a = new int[size];
		
		for(int i = 0;i<size;i++) {
			System.out.println("enter the "+ i+" element :");
			a[i] = sc.nextInt();
		}
		//ascending order
		for(int i = 0;i<size;i++) {
			for(int j= i+1;j<size;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("\nArray in Ascending Order:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
		
		//decsending order
		for(int i = 0;i<size;i++) {
			for(int j= i+1;j<size;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("\nArray in Descending Order:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
		
        
       System.out.println("the max number in array is : " +a[0]);
       System.out.println("the min number in array is : " +a[size -1]);
       System.out.println("the second max number in array is : " +a[1]);
       System.out.println("the second min number in array is : " +a[size - 2]);

		
		/**int max = a[0];
		int min = a[0];
		
		for(int i =0;i<size;i++) {
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("the largest element on the array is :"+max);
		System.out.println("the smallest element on the array is :"+min);
*/
	}

}
