package assignments;

import java.util.Scanner;

public class Pattern_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			char ch = (char)('A'+n-1-i);
			for(int j = 0;j<n-i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		sc.close();
	}

}
