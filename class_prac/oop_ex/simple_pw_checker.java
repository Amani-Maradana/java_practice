package com.codegnan.oop_ex;

public class simple_pw_checker implements passwordChecker {

	@Override
	public String checklength(String password) {
		return ("length " + password.length());
	}

	@Override
	public String checkcomplexity(String password) {
		if (password.length() < 8) {
			return "weak";
		} else {
			if (password.length() == 8) {
				return "Medium";
			} else {
				return "Strong";
			}
		}
	}

}
