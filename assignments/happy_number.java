package assignments;

import java.util.Scanner;

public class happy_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		while (num > 9) {
			int temp = 0;
			int square = 0;
			int sum = 0;
			while (num > 0) {
				temp = num % 10;
				square = temp * temp;
				sum += square;
				num = num / 10;
			}
			num = sum;

		}

		if (original == num) {
			System.out.println(original + " is a happy number ");
		} else {
			System.out.println(original + " is not a happy number");
		}

	}

}
