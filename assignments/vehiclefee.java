package assignments;
import java.util.Scanner;

class vehiclefee {
	public double getfee(double d) {
		return d*2.0;
	}
}

class truckfee extends vehiclefee{
	public double getfee(double d) {
		if(d>100) {
			return (d*2)+50;
		}
		else {
			return super.getfee(d);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distance = sc.nextDouble();
		
		vehiclefee v = new truckfee();
		
		double finalfee = v.getfee(distance);
		System.out.println(finalfee);
		sc.close();
		
	}
	
}
