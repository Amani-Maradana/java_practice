package com.codegnan.fundamentals;

import java.util.Scanner;

public class Armstrong_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 153;
		int original = num;
		int sum= 0;
		
		while(num!=0) {
			int lastDigit = num%10;
			sum+=lastDigit*lastDigit*lastDigit;
			num = num/10;
			
		}
		if (num == sum) {
			System.out.println("is armstrong");
		}
		else {
			System.out.println("is not armstrong");
		}

	}
}
