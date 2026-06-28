package com.codegnan.fundamentals;
import java.util.Scanner;
public class swap_first_last {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int original = num;
		int digit = 0;
		int lastnum = 0;
		int firstnum = 0;
		int temp = 0;
		int sub = 1;
		int finale = 0;
		//counting no. of digits
		while(num != 0) {
			digit++;
			num=num/10;
		}
		
		//knowing last number
		lastnum = original%10;
		
		
		//middle number
		for(int i = 1;i< digit;i++) {
			sub = sub*10;
		}
			
			//first number
		firstnum = original / sub;
		
	    // middle number
		temp = (original %sub)/10;
		
		//complete number 
		
		for(int a = 1;a<digit;a++) {
			lastnum = lastnum *10;
		}
		finale = lastnum + (temp*10)+ firstnum;
		System.out.println("your number is :"+original);
		System.out.println(" the final number is :" +finale);
		
	}

}
