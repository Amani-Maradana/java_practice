package com.codegnan.fundamentals;

import java.util.Scanner;

public class pattern_one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows you want :");
		int row = sc.nextInt();

		// pattern 1 - upper right wing
		for (int i = 1; i <= row; i++) {
			int spaces = 2 * (row - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		// pattern 2 - lower left wing

		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// pattern - 3 - lower right wing

		for (int i = 0; i < row; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (row - i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//

	}

}
