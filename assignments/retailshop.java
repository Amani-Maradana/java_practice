package assignments;

import java.util.Scanner;

class retailshop {
	// for regular
	public double compute(double amount) {
		return amount * 0.90;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount : ");
		Double amount = sc.nextDouble();

		retailshop m1;

		if (amount > 500) {
			m1 = new prime();
		} else {
			m1 = new retailshop();
		}
		double finalamount = m1.compute(amount);
		System.out.println(finalamount);

	}

}

class prime extends retailshop {

	public double compute(double amount) {
		return amount * 0.80;
	}

}

	