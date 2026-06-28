package com.codegnan.oop_ex;

class fortuner implements Car{

	@Override
	public void turnDirection(String dir) {
		if(dir.equals("left")||dir.equals("Left")) {
			System.out.println("fortuner is turning Left");
		}
		if(dir.equals("right")||dir.equals("Right")) {
			System.out.println("fortuner is turning Right");
		}
		
	}

	@Override
	public void accelerates(int points) {
		if(points>= 10&&points<=100) {
			System.out.println("fortuner speed is : "+points);
		}
		
	}

	@Override
	public void stop() {
		System.out.println("fortuner has stopped");
		
	}
	
	public void fourwheel() {
		System.out.println("fortuner engaged with 4 wheels");
	} 

}
