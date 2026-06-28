package com.codegnan.fundamentals;
import java.util.Scanner;
public class Discountcalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your bill value : ");
		double bill = sc.nextDouble();
		double discount = 0;
		discount = (bill>=200.0)?0.5:(bill>=100.0)?0.25:0.0;
		double amount = 0;
		amount = bill*discount;
		double discounted_amount = bill-amount;
		double discountt = discount*100;
		
		 System.out.println("your bill is : "+bill);
		 System.out.println("discount % you received  is : "+discountt);
		 System.out.println("amount of discount received is :  "+amount);
		 System.out.println("the final amount is : "+discounted_amount);

	}

}
