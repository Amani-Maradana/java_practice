package assignments;

import java.util.Scanner;

class device {
	String brand;

	public device(String brand) {
		this.brand = brand;
	}
}

class smartphone extends device{
	String model;
	public smartphone(String brand, String model) {
		super(brand);
		this.model = model;
	}
	
	public String validateString(String brand) {
	if(brand.equals("None")) {
		return  "Generic";
	}
	else {
		return brand;
	}
	}
	
	public void displaydetails() {
		System.out.println(" the brand is : "+brand);
		System.out.println(" the model is : "+model);
	}
	
	class Main{
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			String brand = sc.next();
			String model = sc.next();
			
			smartphone sp = new smartphone(brand ,model);
			sp.displaydetails();
		}
	}
}











