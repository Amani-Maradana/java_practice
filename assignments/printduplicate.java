package assignments;

import java.util.Scanner;

public class printduplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the string :");
		String input = sc.nextLine();
		
		System.out.println("duplicate characters :");
		
		for(int i = 0; i<input.length();i++) {
			char ch = input.charAt(i);
			
			boolean seenbefore = false;
			
			for(int j = 0;j<i;j++) {
				if(input.charAt(j) == ch) {
				seenbefore = true;
				break;
				}
			}
			
			if(!seenbefore) {
				for(int k = i+1;k<input.length();k++) {
					if(input.charAt(k) == ch) {
						System.out.println(ch + " ");
						break;
					}
				}
			}
		}
		sc.close();

	}

}
