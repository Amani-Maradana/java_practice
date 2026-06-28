package com.codegnan.oop_ex;

public class vehicle_demo {

	public static void main(String[] args) {
		vehicle car = new Car1();System.out.println("car operations");
		car.start();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.brake();
		car.start();
		System.out.println("motor cycle operations");
		vehicle mc = new motorcycle();
		mc.start();
		mc.accelerate();
		mc.accelerate();
		mc.accelerate();
		mc.accelerate();
		mc.accelerate();
		mc.brake();
		mc.start();
		
	}

}
