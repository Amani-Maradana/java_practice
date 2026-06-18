package assignments;
import java.util.Scanner;
public class spy_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		int product = 1;
		while(num >0) {
			int temp = 0;
			temp = num%10;
			sum+=temp;
			product *=temp;
			num= num/10;
		}
		if(sum ==product ) {
			System.out.println( original +" is a spy number ");
		}
		else {
			System.out.println(original +" is not a spy number");
		}

	}

}
