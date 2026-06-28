package com.codegnan.oop_ex;

public class motorcycle implements vehicle{
	private int currentspeed;
	private boolean isEngineOn;
	

	public motorcycle() {
		super();
		this.currentspeed = 0;
		this.isEngineOn = false;
	}

	@Override
	public void start() {
		isEngineOn = true;
		System.out.println("motorcycle engine started");
	}

	@Override
	public void stop() {
		isEngineOn = false;
		currentspeed = 0;
		System.out.println("motorcycle stopped");
		
	}

	@Override
	public void accelerate() {
		if(isEngineOn && currentspeed< MAX_SPEED) {
			currentspeed +=20;
			System.out.println("car accelerating current speed "+currentspeed);
		}
		
	}

	@Override
	public void brake() {
		if(currentspeed>0) {
			currentspeed -= 25;
			if(currentspeed<0) {
				currentspeed = 0;
			}
			System.out.println("motorcycle braking current speed "+currentspeed);

		}
		
	}

	@Override
	public int getCurrentSpeed() {
		return currentspeed;
	}

}
