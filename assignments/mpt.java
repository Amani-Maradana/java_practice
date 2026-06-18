package assignments;

import java.util.Scanner;

class mpt {
	public mpt(){
		System.out.println("Electronic initialized.....");
	}
}

class Dev extends mpt{
	String brand;
	public Dev (String brand) {
		super();
		this.brand = brand;
		System.out.println("Device initialized: "+this.brand);
	}
}
class SMARTPHONE extends Dev{
	int capacity;
	
	public SMARTPHONE(String brand, int capacity) {
		super(brand);
		this.capacity = capacity;
		
		System.out.println("SmartDevice initialized: "+this.capacity +"GB");
	}
	
	class Main{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String brand = sc.next();
			int capacity = sc.nextInt();
			
			SMARTPHONE sp = new SMARTPHONE(brand,capacity);
			
		}
	}
	
	
}



