package assignments;
import java.util.Scanner;
abstract class IDprocessor {
	public abstract int compute(int id);
	
	//main class
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		IDprocessor ID = new finalvalidator();
		System.out.println("enter your id:");
		int id = sc.nextInt();
		
		int result = ID.compute(id);
		System.out.println(result);
	}
	
	
}

final class finalvalidator extends IDprocessor{
	public int compute(int id) {
		if(id%2==0) {
			return (id/2);
		}
		else {
			return (id*3+1);
		}
	}
	
}
