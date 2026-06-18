package assignments;

import java.util.Scanner;

public class bankapp {

	private int balance;

	public bankapp(int balance) {
		this.setBalance(balance);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class savingsacc extends bankapp {
	

	private int interest;

	public savingsacc(int balance, int interest) {
		super(balance);
		this.interest = interest;
	}


	public int setinterest( int interest) {
		if (interest < 100) {
			this.interest  = 0;
		}
		else {
			this.interest = interest;
		}
		return interest;
	}
	
	public int getinterest() {
		return interest;
	}
	
	public int calculateinterest() {
		int calcinterest = getBalance() + interest;
		return calcinterest;
	}
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int balance = sc.nextInt();
		int interest = sc.nextInt();
		
		savingsacc sa =  new savingsacc (balance,interest);
		System.out.println(" the interest is : "+sa.calculateinterest());
		
		
	}
	
}

	


