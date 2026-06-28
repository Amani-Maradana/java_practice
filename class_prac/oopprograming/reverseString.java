package com.codegnan.oopprograming;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string :");
		String str = sc.nextLine();
		String reversed = " ";
		for(int i = str.length()-1;1>=0;i--) {
			char currentchar = str.charAt(i);
			reversed+=currentchar;
		}
		/*StringBuilder sb = new StringBuilder("codegnan");
		sb.reverse();
		System.out.println(sb); */

	}

}
