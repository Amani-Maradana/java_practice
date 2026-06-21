package assignments;

import java.util.Scanner;

public class gym {

	private int id;
	private int steps;
	
	public void setid() {
		this.id = id;
	}
	public void setsteps() {
		this.steps= steps;
	}
	public int getid(int id) {
		return id;
	}
	public int getsteps(int steps) {
		return steps;
	}
	
	// calc methods
	
	public double steps(int steps) {
		return steps*0.05;
	}
	public int steps() {
		return 10;
	}
	public double fixsteps(int steps) {
		return (steps*0.05)+10;
	}
	
	//main class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		gym g = new gym ();
		System.out.println("enter your id :");
		int id = sc.nextInt();
		System.out.println("enter the steps :");
		int steps = sc.nextInt();
		
		System.out.println("steps : ");
		int steps2 = sc.nextInt();
		System.out.println("steps : ");
		int fixed = sc.nextInt();
		System.out.println("steps : ");
		int steps3 = sc.nextInt();
		
		System.out.println(g.steps(steps2));
		System.out.println(g.steps());
		System.out.println(g.fixsteps(steps3));
		System.out.println(g.getid(id));
		System.out.println(g.getsteps(steps));
		
	}
	
	
}
