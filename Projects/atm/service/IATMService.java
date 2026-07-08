package com.codegnan.atm.service;

import com.codegnan.atm.exceptions.InsufficientBalanceException;
import com.codegnan.atm.exceptions.InsufficientMachineBalanceException;
import com.codegnan.atm.exceptions.InvalidAmountException;
import com.codegnan.atm.exceptions.NotAOperatorException;

public interface IATMService {
	// to get the type of user
	public abstract String getUserType() throws NotAOperatorException;

   // with throw exceptions for insufficient balance, invalid amount or for insufficient machine balance
	public abstract double withdrawAmount(double wthAmount)
			throws InsufficientBalanceException, InvalidAmountException, InsufficientMachineBalanceException;
	
	//for invalid amount 
	public abstract void depositAmount(double dptAmount) throws InvalidAmountException;
	
	
	public abstract double checkAccountBalance();
	
	public abstract void changePinNumber(int PinNumber);
	
	public abstract int getPinNumber();
	
	public abstract String getUserName();
	//to decrease the number of chances while entring the wrong pin number
	public abstract void decreasesChances();
	// to get the no. of chances
	public abstract int getChances();
	// reset pin chances by opertaor
	public abstract void resetPinChances();
	//to get the ministatement of an account
	public abstract void generateMiniStatement();
	
	
}
