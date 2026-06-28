package com.codegnan.fundamentals;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number :");
		int num = sc.nextInt();
		int result = 1;
		for(int i = 1; i<=num;i++) {
			result *=i;
		}
		System.out.println("the factorial of the "+num +" is : " +result);
		sc.close();

	}

}
