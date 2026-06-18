package assignments;
import java.util.Scanner;
public class d_5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int discount = sc.nextInt();
		int surcharge = sc.nextInt();
		int budget = sc.nextInt();
		
		price = price - discount;
		price = price + discount;
		
		if(price>0 && price<=budget) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
