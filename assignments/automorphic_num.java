package assignments;
import java.util.Scanner;
public class automorphic_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int temp = 0;
		int square = num*num;
		temp = square %100;
		num = num%100;
		if(temp == original ) {
			System.out.println(original +" is a automorphic number");
		}
		else {
			System.out.println(original +" is not a automorphic number");
		}
	}

}
