package com.codegnan.oop;

public class library_fine_calc {
	public static int calcTotalFine(int daysOverDue) {
		// validate input
		if (daysOverDue < 0) {
			return 0;
		} else {
			int fine = daysOverDue * 5;
			if (fine > 1000) {
				fine = 1000;
			} else {
				return fine;
			}
		}
		return daysOverDue;
	}

	public int calcBookFine(int days, String bookType) {
		if (days < 0) {
			return 0;
		} else {
			int rate = 0;
			if (bookType.equals("regular")) {
				rate = 2;
			} else {
				if (bookType.equals("premium")) {
					rate = 3;
				}
			}
			int fine = days * rate;
			if (fine > 1000) {
				fine = 1000;
			}
			return fine;
		}
	}
}
