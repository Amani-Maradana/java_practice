package com.codegnan.fundamentals;
import java.util.Scanner;
public class count_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int num = sc.nextInt();
		int original = num;
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("the count of digits in the given number"+ original+" is : "+count);
		

	}

}
