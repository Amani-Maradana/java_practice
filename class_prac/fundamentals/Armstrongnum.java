package com.codegnan.fundamentals;
import java.util.Scanner;
public class Armstrongnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int number= num;
		int sum = 0;
		int count = 0;
		int lastdigit = 0;
		int i = 1;
		
		//counting the no. of digits
		while(num!=0) {
			count++;
			num =num/10;
		}
		
		//for each digit
		while(original!=0) {
			lastdigit = original%10;
			//powering of each digit
			int a = 1;
			int product =1;
			
			while ( a<=count) {
				product = product *lastdigit; 
				a++;
			}
			sum = sum+product;
			
			original = original/10;
		}
		
		if(sum == number) {
			System.out.println("is armstrong no. :"+sum);
		}
		else {
			System.out.println("is not armstrong");
		}
		
		

	}

}
