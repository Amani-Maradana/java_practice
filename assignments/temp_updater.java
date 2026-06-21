package assignments;
import java.util.Scanner;
public class temp_updater {
	int temp = 24;

	public int gettemp() {
		return this.temp = temp;
	}
	public void settemp(int input ) {
		if(input>40) {
		 this.temp = 40;
		}
		else if(input == -1) {
			this.temp =-1;
		}
		else if(input<-1) {
			return;
		}
		else {
			this.temp = input;
		}
	}
	
	// main class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of inputs : ");
		int n = sc.nextInt();
		
		temp_updater ac = new temp_updater();
		System.out.println("enter the values : ");
		
		for(int i =0; i<n;i++) {
			int input = sc.nextInt();
			ac.settemp(input);
		}
		System.out.println(ac.gettemp());
		sc.close();
		
	}
	
}
