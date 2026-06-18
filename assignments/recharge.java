package assignments;
import java.util.Scanner;
public class recharge {
	private int balance;
	
	public void setbalance(int balance) {
		if(balance < 0) {
			this.balance =0;
		}
		else {
			if(balance>5000){
				this.balance = 5000;
			}
			else {
				this.balance = balance;
			}
		}
	}
	
	public int getbalance() {
		return balance;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			int ipbalance = sc.nextInt();
			recharge bal = new recharge();
			bal.setbalance(ipbalance);
			System.out.println(bal.getbalance());
		}
		sc.close();

	}

}
