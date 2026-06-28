package com.codegnan.fundamentals;
import java.util.Scanner;
public class neon_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();		
		int square = 0;
		square = num*num;
		
		int sum = 0;
		while(square>0) {
			int digit  = square%10;
			sum = sum+digit;
			square=square/10;
			
		}
		
		if(sum == num) {
			System.out.println(num + " is a neon  number");
		}
		else {
			System.out.println(num +" is not a neon number");
		}

	}

}
