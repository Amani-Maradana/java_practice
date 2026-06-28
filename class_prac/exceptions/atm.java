package exceptions;

public class atm {
private double balance;
private final int pin = 1234;
private int pinattempts = 0;
public boolean verifypin(int enteredpin) throws invalidpinexception{
	if(enteredpin == pin) {
		pinattempts = 0;
		System.out.println("access granted");
		return true;
	}
	else {
		pinattempts++;
		if(pinattempts>=3) {
			throw new invalidpinexception("too many incorrect attempts access blocked");
		}
		else {
			System.out.println("invalid pin, attempts left "+(3-pinattempts));
			return false;
		}
	}
}
public void deposit(double amount) throws invalidamountexception{
	if(amount<=0 ||amount%100!=0) {
		throw new invalidamountexception("amount must be positive and multiples of 100");
	}
	balance +=amount;
	System.out.println("deposited successfully , new balance is : "+balance);
}
public void withdraw(double amount) throws invalidamountexception,insufficientfunds{
	if(amount<=0 ||amount%100!=0) {
		throw new insufficientfunds("amount must be positive and multiples of 100");
	}
	balance -=amount;
	System.out.println("withdraw successful , new balance is :"+balance);
}
public void checkbalance() {
	System.out.println(" current balance : "+balance);
}
}
