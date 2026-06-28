package com.codegnan.oop;
import java.util.Scanner;
public class libraryfintest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int daysOverDue = sc.nextInt();
		int days = sc.nextInt();
		String bookType = sc.next();
		int staticFine = library_fine_calc.calcTotalFine(daysOverDue);
		library_fine_calc library_fine_calc = new library_fine_calc();
		
		
		

				

	}

}
