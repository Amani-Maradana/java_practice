package com.codegnan.fundamentals;
import java.util.Scanner;
public class cafee_calc {
	int amount;
	String types;

	public cafee_calc(int amount) {
		this.amount = amount;
	}

	public cafee_calc(int amount, String types) {
		this.amount = amount;
		this.types = types;
	}
	
	// defining methods
	//1st method
	public double discount(int amount) {
		return amount*0.10;
	}
	//2nd method
	public double discount(int amount, String types) {
		if(types == "regualr") {
			return amount*0.05;
		}
		else {
			return amount*0.15;
		}
	}
	//3rd method
	public double discount(int amount,int bonus) {
		return (amount*0.10)+5;
	}
	
	public static void main(String[] args) {}
	Scanner sc = new Scanner(System.in);
	int price = sc.nextInt();
	String type = sc.next();
	int a1= sc.nextInt();
	int a2 = sc.nextInt();
	int a3 = sc.nextInt();
	
	
	
}
