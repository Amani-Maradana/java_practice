package assignments;
import java.util.Scanner;
public class BrewCafeCalc {
	
	//static discount calculator
	public static int staticdiscalc(int totalOrders) {
		if(totalOrders == 0 ) {
			return 0;
		}
		
		int discount =(int)(totalOrders*0.10);
		
		if(discount >100) {
			discount = 100;
		}
		return discount;
	}
	
	
	
	// instance discount calculator
	public int instanceDisCalc(int orderAmount) {
		if(orderAmount <0 ) {
			return 0;
		}
		int discount;
		if(orderAmount < 50) {
			 discount = (int)(orderAmount*0.05); 
		}
		else {
			 discount = (int)(orderAmount*0.15);
		}
		
		if(discount >100) {
			discount = 100;
		}
		return discount;
		
	}
	
	//main class
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int totalOrders = sc.nextInt();
		int orderAmount = sc.nextInt();

		
		int staticdiscount = staticdiscalc( totalOrders);
		
		BrewCafeCalc cafe = new BrewCafeCalc();
		int instancediscount = cafe.instanceDisCalc(orderAmount);
		
        System.out.println(staticdiscount + " " + instancediscount);
        
        sc.close();

	}
	

}
