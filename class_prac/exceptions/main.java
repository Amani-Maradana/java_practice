package exceptions;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws invalidpinexception {
		Scanner sc = new Scanner(System.in);
		atm atm = new atm();
		boolean authenticate = false;
		while(!authenticate) {
			System.out.print("enter your pin");
			int enteredpin = sc.nextInt();
			authenticate = atm.verifypin(enteredpin);
		}

		while(true) {
			System.out.println("1. deposit");
			System.out.println("2. withdraw");
			System.out.println("3. check balance");
			System.out.println("4. exit ");
			System.out.println("enter your choice : ");
			int choice = sc.nextInt();
			try {
				switch(choice) {
				case 1:
					System.out.println(" enter amount to deposit");
					double depositamount = sc.nextDouble();
					atm.deposit(depositamount);
					break;
				case 2:
					System.out.println("enter amount to withdraw : ");
					double withdraw = sc.nextDouble();
					atm.withdraw(withdraw);
					break;
				case 3:
					atm.checkbalance();
					break;
				case 4:
					System.out.println("thank you for using ATM machine");
					return;
					default: 
						System.out.println("please enter a valid option (from 1 to 4) : ");
				}
			}
			catch(insufficientfunds | invalidamountexception e) {
				e.printStackTrace();
			}
		}
	}

}
