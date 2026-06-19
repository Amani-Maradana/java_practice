package assignments;

import java.util.Scanner;

class bot {
	public int power(int n) {
		return n;
	}
	
	//main class
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of inputs you want to give :");
		int ip = sc.nextInt();
		
		bot b;
		int total = 0;
		System.out.println("enter the power values : ");
		for(int i = 0;i<ip;i++) {
			int power = sc.nextInt();
			if(power %2 == 0) {
				b = new cleaner();
			}
			else {
				b= new repairer();
			}
		total += b.power(power);	
		}
		System.out.println("the total power is : "+total);
	}
	
	
}

class cleaner extends bot {
	public int power(int n) {
		return n*2;
	}
}

class repairer extends bot{
	public int power(int n) {
		return n+50;
	}
}
