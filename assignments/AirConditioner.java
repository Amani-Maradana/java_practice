package assignments;

import java.util.Scanner;

public class AirConditioner {
	private int temperature = 40;

	public int gettemperature() {
		return this.temperature;
	}

	public void settemperature(int value) {
		if (value > 40) {
			this.temperature = 40;
		} else {
			if (value == -1) {
				this.temperature = 24;
			} else {
				if (value < -1) {
					return;
				} else {
					this.temperature = value;
				}
			}
		}
	}
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		AirConditioner ac =new AirConditioner();
		for(int i =0 ; i<n;i++) {
			int temp = scanner.nextInt();
			ac.settemperature(temp);
		}
		System.out.println("the updated temperature is : "+ac.gettemperature());
	}
	
	

}
