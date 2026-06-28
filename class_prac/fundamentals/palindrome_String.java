package com.codegnan.fundamentals;
import java.util.Scanner;
public class palindrome_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strings = {"madam","amani","racaecar","level"};
		for(String str:strings) {
			System.out.println("  ");
		}
		
		sc.close();
	}
		/*public static boolean ispalindrome(String str) {
			int left = 0,right = str.length()-1;
			while(left<right) {
				if(str.charAt(left++) ) = str.charAt(right--)){
					return false;
				}
			}
			return true;
	    }*/

	}

