package com.codegnan.atm.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.codegnan.atm.exceptions.IncorrectPinLimitReachedException;
import com.codegnan.atm.exceptions.InsufficientMachineBalanceException;
import com.codegnan.atm.exceptions.InvalidAmountException;
import com.codegnan.atm.exceptions.InvalidCardException;
import com.codegnan.atm.exceptions.InvalidPinException;
import com.codegnan.atm.exceptions.NotAOperatorException;
import com.codegnan.atm.service.IATMService;

public class ATMOperations {
	// initial ATM Machine Balance
	private static double ATM_MACHINE_BALANCE = 1000000.0;
	// List to keep track of all the activities performed on the ATM.
	public static ArrayList<String> ACTIVITY = new ArrayList<>();
	
	// Database to map card numbers to card objects
	public static HashMap<Long, IATMService> dataBase = new HashMap<>();
	// flag to indicate if the ATM Machine is ON or OFF
	public static boolean MACHINE_ON = true;
	// reference to the current card in use
	public static IATMService card;
	
	// validate the inserted card by checking against in database
	public static IATMService validateCard(long cardNumber) throws InvalidCardException{
		if(dataBase.containsKey(cardNumber)) {
			return dataBase.get(cardNumber);
		} else {
			ACTIVITY.add("Accessed by " + cardNumber + " is not Compatible");
			throw new InvalidCardException("This is not a valid card");
		}
	}
	
	public static void checkAtmMachineActivities() {
		System.out.println("=========================Activities Performed=========================");
		for(String activity:ACTIVITY) {
			System.out.println("======================================================================");
			System.out.println(activity);
			System.out.println("======================================================================");
		}
	}
	
	public static void resetUserAttempts(IATMService operatorCard) {
		IATMService card = null;
		long number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Card Number : ");
		number = scanner.nextLong();
		try {
			card = validateCard(number);
			card.resetPinChances();   // resetting pin attempts for the specified card
			ACTIVITY.add("Accessed by : " + operatorCard.getUserName() + " to rest number of chances for user");
		} catch (InvalidCardException e) {
			e.printStackTrace();
		}
	}
	
	public static IATMService validateCredentials(long cardNumber, int pinNumber) throws InvalidCardException, InvalidPinException, IncorrectPinLimitReachedException {
		if(dataBase.containsKey(cardNumber)) {
			card = dataBase.get(cardNumber);
		} else {
			throw new InvalidCardException("This Card is not a valid card");
		}
		try {
			if(card.getUserType().equals("Operator")) {
				if(card.getPinNumber()!=pinNumber) {
					throw new InvalidPinException("Dear Operator, Please Enter Correct Pin Number");
				} else {
					return card;
				}
			}
		} catch (NotAOperatorException e) {
			e.printStackTrace();
		}
		if(card.getChances() <= 0) {
			throw new IncorrectPinLimitReachedException("You have reached wrong limit of Pin number, which is 3 attempts.");
		}
		if(card.getPinNumber() != pinNumber) {
			card.decreasesChances();
			throw new InvalidPinException("You entered a wrong pin number");
		} else {
			return card;
		}
	}
	
	public static void validateAmount(double amount) throws InsufficientMachineBalanceException {
		if(amount > ATM_MACHINE_BALANCE) {
			throw new InsufficientMachineBalanceException("Insufficient Cash in the machine");
		}
	}
	
	public static void validateDepositAmount(double amount) throws InvalidAmountException, InsufficientMachineBalanceException {
		if(amount % 100 != 0) {
			throw new InvalidAmountException("Please Deposit Multiples of 100");
		}
		if(amount + ATM_MACHINE_BALANCE > 2000000.0) {
			ACTIVITY.add("Unable to Deposit Cash in the Machine");
			throw new InsufficientMachineBalanceException("You can't deposit cash, as the limit of the cash is reached");
		}
	}
	public static void operatorMode(IATMService card) {
		Scanner scanner = new Scanner(System.in);
		double amount;
		boolean flag = true;
		while(flag) {
			System.out.println("Operator Mode : Operator Name " + card.getUserName());
			System.out.println("||=========================================================||");
			System.out.println("||==============1. Switch off the machine==================||");
			System.out.println("||==============2. Check ATM Machine Balance===============||");
			System.out.println("||==============3. Deposit Cash in the machines============||");
			System.out.println("||==============4. Reset User Pin Attempt==================||");
			System.out.println("||=========================================================||");
		}
	}
}