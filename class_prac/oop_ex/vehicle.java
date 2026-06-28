package com.codegnan.oop_ex;

interface vehicle {
	int MAX_SPEED = 200;
	String FUEL_TYPE = "petrol";
	void start();
	void stop();
	void accelerate();
	void brake();
	int getCurrentSpeed();

}
