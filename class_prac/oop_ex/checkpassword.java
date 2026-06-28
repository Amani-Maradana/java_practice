package com.codegnan.oop_ex;

import java.util.Scanner;

public class checkpassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a password : ");
		String password = sc.nextLine();
		passwordChecker pc = new simple_pw_checker();
		System.out.println(pc.checklength(password));
		System.out.println(pc.checkcomplexity(password));
		
		
	}

}
