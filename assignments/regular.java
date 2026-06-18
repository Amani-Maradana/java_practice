package assignments;
import java.util.Scanner;
public class regular {
public double calculate(double amount) {
	return amount*=0.90;
}
}

class premium extends regular{
	public double calculate(double amount) {
		if(amount >100) {
			return amount*=0.80;
		}
		else {
			return amount;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int amount = sc.nextInt();
		 
		 regular customer;
		 
		 if(amount>500) {
			 customer = new premium(); 
		 }
		 else {
			 customer = new regular();
		 }
		 
		 System.out.println(" the final price : "+customer.calculate(amount));
	}
	
	
}

