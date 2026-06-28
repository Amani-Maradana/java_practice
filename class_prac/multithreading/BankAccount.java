package com.codegnan.multithreading;

public class BankAccount {
private double balance;

public BankAccount(double balance) {
	super();
	this.balance = balance;
}
public synchronized void withdraw(String user,double amount) {
	System.out.println(user +" trying to withdraw "+amount);
	if(balance>=amount) {
		System.out.println(user +" is processing withdraw ");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		balance -= amount;
		System.out.println(user +" completed withdraw , remaining balance : "+balance);
	}
	else {
		System.out.println(user +" insufficient funds available balance : "+balance);
	}
	System.out.println("----------------------------------------------------------------------");
}
}
