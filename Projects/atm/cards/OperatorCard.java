package com.codegnan.atm.cards;

import com.codegnan.atm.exceptions.InsufficientBalanceException;
import com.codegnan.atm.exceptions.InsufficientMachineBalanceException;
import com.codegnan.atm.exceptions.InvalidAmountException;
import com.codegnan.atm.exceptions.NotAOperatorException;
import com.codegnan.atm.service.IATMService;

public class OperatorCard implements IATMService{

	private int pinNumber;
	private long id;
	private String name;
	private final String type = "operator";
	public OperatorCard(long id,int pin,String name) {
		this.id=id;
		this.name=name;
		this.pinNumber= pin;
	}
	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InsufficientBalanceException, InvalidAmountException, InsufficientMachineBalanceException {
		return 0;
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
		
	}

	@Override
	public double checkAccountBalance() {
		return 0;
	}

	@Override
	public void changePinNumber(int PinNumber) {
		
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
		
	}

	@Override
	public int getChances() {
		return 0;
	}

	@Override
	public void resetPinChances() {
		
	}

	@Override
	public void generateMiniStatement() {
		
	}

}
