package com.codegnan.oopprograming;

public class appointmenttest {

	public static void main(String[] args) {
		appointment appo = new appointment();
		appo.schedule();
		doctorappo doc = new doctorappo();
		doc.schedule();
		dentistappo den = new dentistappo();
		den.schedule();

	}

}
