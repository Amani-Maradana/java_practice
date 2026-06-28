package com.codegnan.oop_ex;

public class vehicleApp {

	public static void main(String[] args) {
		//fortuner f1 = new fortuner();
		//slavia f1 = new slavia();
		Car f1 = new fortuner();
		f1.accelerates(20);
		f1.accelerates(40);
		f1.accelerates(50);
		f1.accelerates(20);
		f1.turnDirection("left");
		f1.accelerates(40);
		f1.accelerates(50);
		//f1.stop();f1.fourwheel();

	}

}
