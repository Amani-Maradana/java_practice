package assignments;
import java.util.Scanner;
public class perfect_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		int temp =0;
		for(int i = 1 ;i<num ;i++) {
			if((num%i)==0) {
				sum+=i;
			}
		}
		if(original == sum ) {
			System.out.println(original +" is a perfect number");
		}
		else {
			System.out.println(original +" is not a perfect number");
		}

	}

}
