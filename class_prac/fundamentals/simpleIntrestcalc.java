package com.codegnan.fundamentals;
import java.util.Scanner;
public class simpleIntrestcalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle amount: ");
		int principle = sc.nextInt();
		System.out.println("Enter the time: ");
		int time = sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		int interest = sc.nextInt();
		
		int simple_interest = (principle*time*interest)/100;
		int total = principle + simple_interest;
		System.out.println(" Simple interest is : "+simple_interest);
		System.out.println(" Total amount is  is : "+total);

		sc.close();
	}

}
