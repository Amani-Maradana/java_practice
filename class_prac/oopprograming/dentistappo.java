package com.codegnan.oopprograming;
import java.util.Scanner;
public class dentistappo extends appointment{


	public void schedule() {
		Scanner sc = new Scanner(System.in);
		System.out.print("dental.procedure :");
		String pro = sc.next();
		System.out.println("Dentist appointent scheduled for :"+pro);
				
	}

}
