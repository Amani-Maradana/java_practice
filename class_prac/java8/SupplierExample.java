package com.codegnan.java8;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String>msg = ()->"Hello from supplier";
		System.out.println(msg.get());
		Supplier<Integer> message = ()-> (int)Math.random()*100;
		System.out.println(message.get());
		Supplier<LocalDate> date = ()->LocalDate.now();
		System.out.println(date.get());
		Supplier<String> otp = ()->{
			String code = "";
			for(int i = 0;i<6;i++) {
				code+=(int)(Math.random()*10);
			}
			return code;
		};
		System.out.println("Generated OTP : "+otp.get());
	}

}
