package com.codegnan.fundamentals;
import java.util.Scanner;
public class airlinetktprice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = 5000;
		double baseprice = 0;
		System.out.println("enter your category (child/adult/senior)");
		String category = sc.nextLine().toLowerCase();
		System.out.println("enter your time of booking (early/normal/late)");
		String time = sc.nextLine().toLowerCase();
		System.out.println("are you a premium member (yes/no)");
		String membership = sc.nextLine().toLowerCase();
		
		if(category.equals("child")) {
			baseprice = 0.5*base;
		}
		else {
			if(category.equals("senior")) {
				baseprice = 0.8*base;
			}else {
				baseprice = base;
			}
		}
		
		if(time.equals("early")) {
			baseprice *= 0.9;
		}
		else {
			if(time.equals("late")) {
				baseprice *= 1.2;
			}else {
				baseprice = base;
			}
		}
		
		
	if (membership.equals("yes")) {
		baseprice *=0.95; 
	}
	
	System.out.println("the baseprice of the ticket is : "+base);
	System.out.println("the category you are is : "+category);
	System.out.println("time of booking : "+time);
	System.out.println("membership : "+membership);
	System.out.println("the final price of the ticket is : "+baseprice);
		
		
		
		sc.close();

	}

}
