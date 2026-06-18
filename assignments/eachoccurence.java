package assignments;

import java.util.Scanner;

public class eachoccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string :");
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			boolean seenbefore = false;

			for (int j = 0; j < i; j++) {
				if (input.charAt(j) == ch) {
					seenbefore = true;
					break;
				}
			}

			if (!seenbefore) {
				int count = 0;
				for (int k = 0; k < input.length(); k++) {
					if (input.charAt(k) == ch) {
						count++;
					}
				}
				System.out.println("'" + ch + "' -->" + count);

			}
		}

	}

}
