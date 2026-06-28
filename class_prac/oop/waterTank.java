package com.codegnan.oop;

import java.util.Scanner;

public class waterTank {
	private int currentLevel = 0;
	private int maxLevel = 0;

	public void setcurrentLevel(int currentLevel) {
		if (currentLevel <= 0 && currentLevel <= 500) {
			this.currentLevel = currentLevel;
			if (currentLevel > maxLevel) { // updation of max value
				maxLevel = currentLevel;
			}
		}

	}
	public int getcurrentLevel() {
		return currentLevel;
	}
	
	public int getmaxLevel() {
		return maxLevel;
	}
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		waterTank waterTank = new waterTank();
		int level ;
		while(true) {
			level = sc.nextInt();
			if(level ==-999) {
				break;
			}
			waterTank.setcurrentLevel(level);
		}
		System.out.println(waterTank.getcurrentLevel());
		System.out.println(waterTank.getmaxLevel());
		sc.close();
	}

}
