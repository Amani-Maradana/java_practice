package com.codegnan.multithreading;

public class myrunnabletest {

	public static void main(String[] args) {
		myrunnable r = new myrunnable();
		Thread t = new Thread(r);
		t.start();
		//r.run();
		for(int i =10;i<20;i++) {
			System.out.println(i);
		}
		
	}

}
