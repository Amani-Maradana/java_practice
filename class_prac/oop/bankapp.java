package com.codegnan.oop;

public class bankapp {

	public static void main(String[] args) {
		bankAccount acc1 = new bankAccount();
		acc1.createAccount("amani",678788099664567687l, 7678);
		bankAccount acc2 = new bankAccount();
		acc2.createAccount("aman",78788099664567687l, 67678);
		acc1.deposit(1000);
		acc1.withdraw(9898);
		acc1.displayinfo();
		acc2.deposit(4874);
		acc2.withdraw(5656);
		acc2.displayinfo();


	}

}
