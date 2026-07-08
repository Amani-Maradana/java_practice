package com.codegnan.atm.cards;

import java.util.ArrayList;
import java.util.Collections;

import com.codegnan.atm.exceptions.InsufficientBalanceException;
import com.codegnan.atm.exceptions.InsufficientMachineBalanceException;
import com.codegnan.atm.exceptions.InvalidAmountException;
import com.codegnan.atm.exceptions.NotAOperatorException;
import com.codegnan.atm.service.IATMService;

public class KotakDebitCard implements IATMService{
	String name;
	long debitCardNumber;
	double accountBalance;
	int pinNumber;
	ArrayList<String> statement;
	final String type = "user";
	int chances;
	
	public KotakDebitCard(long debitCardNumber,String name,double accountBalance,int pinNumber) {
		chances = 3;
		this.debitCardNumber= debitCardNumber;
		this.name = name;
		this.accountBalance = accountBalance;
		this.pinNumber = pinNumber;
		statement = new ArrayList<>();
		
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InsufficientBalanceException, InvalidAmountException, InsufficientMachineBalanceException {
		if(wthAmount<500 || wthAmount%100!=0) {
			throw new InvalidAmountException("please withdraw more than 500/- or please withdraw multiples of 100 ");
		}
		else {
			if(wthAmount>accountBalance) {
				throw new InsufficientBalanceException("insufficient balance check your balance ");
			}
			else {
				accountBalance -= wthAmount;
				statement.add("Debited : "+wthAmount);
				return wthAmount;
			}
		}
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
		if(dptAmount <500 || dptAmount%100!=0 ) {
			throw new InvalidAmountException("please deposit multiples of 100  or minimum balance is 500");
		}
		else {
			accountBalance += dptAmount;
			statement.add("Credited : "+dptAmount);
		}
		
	}

	@Override
	public double checkAccountBalance() {
		return accountBalance;
	}

	@Override
	public void changePinNumber(int PinNumber) {
		this.pinNumber = pinNumber;
		
	}

	@Override
	public int getPinNumber() {
		return pinNumber;
	}

	@Override
	public String getUserName() {
		return name;
	}

	@Override
	public void decreasesChances() {
		--chances;
		
	}

	@Override
	public int getChances() {
		return chances;
	}

	@Override
	public void resetPinChances() {
		chances = 3;
		
	}

	@Override
	public void generateMiniStatement() {
		int count = 5;
		if(statement.size()==0) {
			System.out.println("no transactions happened");
			return;
		}
		System.out.println("list of 5 transactions : ");
		for(String trans : statement) {
			if(count == 0) {
				break;
			}
			System.out.println(trans);
			count --;
		}
		Collections.reverse(statement);	
	}
	

}
