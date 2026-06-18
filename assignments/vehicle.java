package assignments;

import java.util.Scanner;

public class vehicle {
public double getfee(double d) {
	return d*2.0;
}
}

class truck extends vehicle{
	public double getfee(double d) {
		if(d>100) {
			return d*1.50+50;
		}
		else {
			return super.getfee(d);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distance = sc.nextDouble();
		
		vehicle veh = new truck();
		
		double fee = veh.getfee(distance);
		
		System.out.println(fee);
		
		
		
	}
}
