package assignments;

import java.util.Scanner;

abstract class base {
	public final boolean isvalid(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public abstract int apply(int value, int index);

	// main class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of inputs you want to enter : ");
		int n = sc.nextInt();
		int[] results = new int[n];


		System.out.println("enter the values: ");
		base b = new worker();
		for (int i = 1; i <= n; i++) {
			int value = sc.nextInt();

			results[i - 1] = b.apply(value, i);
		}
		System.out.println("final output:");
		for (int i = 0; i < n; i++) {
			System.out.println(results[i]);
		}
		sc.close();

	}

}

final class worker extends base {

	public int apply(int value, int index) {
		if (isvalid(value)) {
			return value * index;
		} else {
			return value + index;
		}
	}

}
