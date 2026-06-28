package com.codegnan.fundamentals;
import java.util.Scanner;
public class reverse_even_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your num :");
		int num = sc.nextInt();
		int original = num;
		int rem = 0;
		int count = 0;
		int even = 0;
		int odd = 0;
		//count the digits
		int tempnum = num;
		while (tempnum > 0) {
			count++;
			tempnum = tempnum / 10;
		}
		
		num = original;
		for(int i = 0;i<count;i++) {
			rem = num%10;
			if(rem %2==0) {
				even = even*10 +rem;
			}
			num = num/10;
		}
		
		int x=0;
		int y=0;
		int temp = 0;
		while(original>0) {
			temp = original %10;
			if(temp %2 ==0) {
				x = even%10;
				y = (y*10)+x;
				even = even/10;
			}
			else {
				x = temp;
				y = (y * 10) + x;
			}
			original = original/10;
		}
		
		int finale = 0;
		while(y>0) {
			finale = (finale*10)+(y%10);
			y = y/10;
		}
		System.out.println("Reversed even number output: " + finale);
	}

}
