package com.codegnan.fundamentals;
import java.util.Scanner;
public class automorphic_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number  :");
		int num = sc.nextInt();
		int original = num ;
		int square = num*num;
		int divisor = 1;
		
		while(num>0) {
			divisor = divisor*10;
			num=num/10;
		}
		int lastdigits = square % divisor;
		
		if(original == lastdigits) {
			System.out.println("it is an automorphic number");
		}
		else {
			System.out.println("it is not an automorphic number");
		}
		

	}

}
