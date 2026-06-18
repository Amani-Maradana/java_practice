package assignments;
import java.util.Scanner;
public class neon_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int temp = 0;
		int square = 0;
		int sum = 0;
		square = num*num;
		while(square >0) {
			temp = square %10;
			sum += temp;
			square = square/10;
		}
		if(original == sum) {
			System.out.println(original +" is a neon number");
		}
		else {
			System.out.println(original +" is not a neon number");
		}
		
	}

}
