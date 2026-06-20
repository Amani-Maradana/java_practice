package assignments;
import java.util.Scanner;
abstract class processor {
	 abstract int compute(int x);
	 
	 // main class
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("no. of inputs :");
		 int x = sc.nextInt();
		 System.out.println("enter the multiplication factor :");
		 int k = sc.nextInt();
		 System.out.println("enter the values: ");
		 processor p = new DataHandler(k);
		 int result [] = new int[x];
		 
		 for(int i = 0;i<x;i++) {
			 int value = sc.nextInt();
			 
			 if(value<= 0 ) {
				 System.out.println("ERROR");
			 }
			 else {
				 int num = p.compute(value);
				 result[i] = num;
			 }
		 }
		 
		 for(int i = 0;i<x;i++) {
			 System.out.print(result[i]+" ");
		 }
		 
	 }

}

final class DataHandler extends processor{
	int k;
	public DataHandler(int k) {
		this.k = k;
	}
	
	int compute (int x) {
		return x*k;
	}
}
