package assignments;
import java.util.Scanner;
public class strong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int temp = 0;
		int sum = 0;
		while(num>0) {
			temp = num%10;
			
			int fact = 1;

			for(int i = 1; i<=temp;i++) {
				fact *=i;
			}
			sum+=fact;
			num = num/10;
		}
		if(original ==sum ) {
			System.out.println(original +" is a strong number");
		}
		else {
			System.out.println(original +" is  not a strong number");
		}
		
	}

}
