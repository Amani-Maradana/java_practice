package com.codegnan.fundamentals;
import java.util.Scanner;
public class Strong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number :");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		
		while(num>0) {
			int temp =num%10;
			int factorial = 1;
			
			for(int i = 1;i<= temp;i++) {
				factorial = factorial*i;
			}
			 sum = sum+factorial;
			 num = num/10;
			
		}
		
		if (sum == original) {
            System.out.println(original + " is a Strong number");
        } else {
            System.out.println(original + " is NOT a Strong number");
        }

	}

}
