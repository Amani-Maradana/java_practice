package com.codegnan.fundamentals;
import java.util.Scanner;
public class reverse_num {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int reversenum = 0;
		
		while(num!=0) {
			int lastdigit = num%10;
			reversenum = reversenum*10 + lastdigit ;
			num = num/10;
		}
		
		if (reversenum<0) {
			int neg = -1;
			 reversenum = reversenum*neg;
		    }
		System.out.println("the reverse is : "+reversenum);
		
	}
	
}


