package com.codegnan.oopprograming;

import java.util.Scanner;

public class main_calculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		my_calculation mycalculation = new my_calculation(num1, num2);
		int sum = mycalculation.addition();
		int product = mycalculation.multiplication();
		System.out.println(sum);
		System.out.println(product);
	}

}
