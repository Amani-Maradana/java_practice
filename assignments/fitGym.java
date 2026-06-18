package assignments;

import java.util.Scanner;

public class fitGym {
	private int memberID;
	private int steps;
	
	public int getmemberID() {
		return memberID;
	}
	public int getSteps() {
		return steps;
	}
	
	public void setgetmemberID(int ID) {
		this.memberID = ID;
	}
	public void setsteps(int steps) {
		this.steps = steps;
	}
	
	public int calories(int steps) {
		int calories = (int)(steps*0.05);
		return calories;
	}
	
	public int calories() {
		int calories = 10;
		return calories;
	}
	
	public int calories(int steps, int fc) {
		int calories = (int)(steps*0.05+10);
		return calories;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int memberId = sc.nextInt();
		int steps = sc.nextInt();
		int steps2 = sc.nextInt();
		int dummy = sc.nextInt();
		int steps3  =sc.nextInt();
		int fc = 10;
		
		fitGym fg = new fitGym();
		fg.setgetmemberID(memberId);
		fg.setsteps(steps);
		
		System.out.println("calories form steps : "+fg.calories(steps2));
		System.out.println("fixed calories : "+fg.calories());
		System.out.println("calories with fixed steps : "+fg.calories(steps3));
		System.out.println("member id : "+fg.getmemberID());
		System.out.println("steps : "+fg.getSteps());
		
		
	}

}
