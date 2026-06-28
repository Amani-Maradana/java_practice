package com.codegnan.fundamentals;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reversenum= 0;
		int original = num;
		
		while(num!=0) {
			int lastDigit = num%10;
			reversenum = reversenum*10+ lastDigit;
			num = num/10;
			
		}
		if (num == reversenum) {
			System.out.println("the given num is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		
		sc.close();
		

	}
}
