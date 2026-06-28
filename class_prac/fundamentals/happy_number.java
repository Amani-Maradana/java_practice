package com.codegnan.fundamentals;
import java.util.Scanner;
public class happy_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int nextnum = 0;
		int a=0;
		
		while(num !=1 && num !=4) {
			nextnum = 0;
			while(num > 0) {
				a = num % 10;
				nextnum += (a*a);
				num = num /10;
			}
			num = nextnum;
		}
		
		
		if (num == 1) {
			System.out.println("it is happy number :" +original);
		}
		else {
			System.out.println("not a happy number");
		}

	}

}
