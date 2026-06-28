package com.codegnan.oop;

public class bankAccount {
String accountHolderName;
long accountNumber;
double balance;

public void createAccount(String name,long accNumber,double initialBalance) {
	accountHolderName = name;
	accountNumber = accNumber;
	balance = initialBalance;
}

public void deposit(double amount) {
balance+= amount;
System.out.println(amount +" deposited successfully");
}

public void withdraw(double amount) {
if(amount<=balance) {
	balance-=amount;
	System.out.println(amount+" withdraw successful");
}
else {
	System.out.println("insufficient funds");
}
}

public void displayinfo() {
	System.out.println("account holder name :"+accountHolderName);
	System.out.println("account number :"+accountNumber);
	System.out.println("balance amount is :" +balance);
}



}
