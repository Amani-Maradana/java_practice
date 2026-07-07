package com.codegnan.iostreams;

import java.io.Serializable;

public class ATMCard implements Serializable{
private long cardnumber;
private transient int pin;
private String expiredate;
private int cvv;
private String cardholdername;
public ATMCard(long cardnumber, int pin, String expiredate, int cvv, String cardholdername) {
	super();
	this.cardnumber = cardnumber;
	this.pin = pin;
	this.expiredate = expiredate;
	this.cvv = cvv;
	this.cardholdername = cardholdername;
}
@Override
public String toString() {
	return "ATMCard [cardnumber=" + cardnumber + ", pin=" + pin + ", expiredate=" + expiredate + ", cvv=" + cvv
			+ ", cardholdername=" + cardholdername + "]";
}


}
