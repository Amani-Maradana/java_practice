package com.codegnan.fundamentals;
import java.util.Scanner;
public class spy_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number :");
		int num = sc.nextInt();
		int original = num ;
		int count = 0;
		
		while(num > 0) {
			count++;
			num = num/10;
		}
		int sum = 0;
		int product = 1;
		int temp = 0;
		
		for(int i = 0; i<count ;i++ ) {
			temp = original%10;
			sum = sum+temp;
			product = product*temp;
			original = original/10;
		}
		
		if(sum == product) {
			System.out.println("The number is a spy number");
		}
		else {
			System.out.println("the no. is not spy number");
		}
			
		

	}

}
