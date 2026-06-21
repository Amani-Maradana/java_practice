package assignments;
import java.util.Scanner;
public class data_recharge {
	int data;
	
	public int getbalance() {
		return this.data= data;
	}
	
	public void setbalance(int input) {
		if(input<0) {
			this.data=0;
		}
		else if(input >5000) {
			this.data=5000;
		}
		else {
			this.data = input;
		}
	}
	
	//main class
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		data_recharge dr = new data_recharge();
		dr.setbalance(input);
		System.out.println(dr.getbalance());
		sc.close();
	}

}
