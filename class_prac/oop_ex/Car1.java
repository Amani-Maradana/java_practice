package com.codegnan.oop_ex;

public class Car1 implements vehicle{
	private int currentspeed;
	private boolean isEngineOn;
	

	public Car1() {
		super();
		this.currentspeed = 0;
		this.isEngineOn = false;
	}

	@Override
	public void start() {
		isEngineOn = true;
		System.out.println("car engine started");
	}

	@Override
	public void stop() {
		isEngineOn = false;
		currentspeed = 0;
		System.out.println("car stopped");
		
	}

	@Override
	public void accelerate() {
		if(isEngineOn && currentspeed< MAX_SPEED) {
			currentspeed +=10;
			System.out.println("car accelerating current speed "+currentspeed);
		}
		
	}

	@Override
	public void brake() {
		if(currentspeed>0) {
			currentspeed -= 15;
			if(currentspeed<0) {
				currentspeed = 0;
			}
			System.out.println("car braking current speed "+currentspeed);

		}
		
	}

	@Override
	public int getCurrentSpeed() {
		return currentspeed;
	}

}
