package com.codegnan.fundamentals;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reversenum= 0;
		
		while(num>0) {
			int lastDigit = num%10;
			reversenum = reversenum*10+ lastDigit;
			num = num/10;
			
		}
		System.out.println("reverse of the number is : "+reversenum);
		
		sc.close();
		

	}

}
