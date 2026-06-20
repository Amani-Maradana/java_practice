package assignments;
import java.util.Scanner;
abstract class protocol {
	public final int handle(int number) {
		if (number % 2 == 0) {
			return -1;
		} else {
			return transform(number);
		}
	}
	
	public abstract int transform(int number);
	
	//main class
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of iputs you want to give :");
		int input = sc.nextInt();
		StringBuilder result = new StringBuilder();
		System.out.println("enter the values: ");
		
		protocol p = new sensorprotocol();
		for(int i = 0; i<input;i++) {
			int values = sc.nextInt();

			int num = p.handle(values);
			
			result.append(num).append("\n");
		}
		System.out.println("output :");
		System.out.print(result);
	}
}

class sensorprotocol extends protocol{
	public int transform(int number) {
		int square = number*number;
		int sum = 0;
		
		while(square>0) {
			sum += square%10;
			square = square/10;
		}
		return sum;
	}
	
}

