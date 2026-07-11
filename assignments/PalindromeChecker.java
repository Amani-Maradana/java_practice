package assignments;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
	
	public static boolean isPalindrome(String str) {
		Stack<Character> stack = new Stack<>();
		
		
		for(int i = 0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) != stack.pop()) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(isPalindrome(input));
		sc.close();
	}

}
