package com.codegnan.fundamentals;
import java.util.Scanner;
public class product_until_single_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp =0;
		 while(!(num<10)) {
			 int product = 1;
			 while(num>0) {
			 temp = num%10;
			 product = product*temp;
			 num = num/10;
			 }
			num = product;
		 }
		 System.out.println("Final single digit product: " + num);
	}

}
