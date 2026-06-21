package assignments;

import java.util.Scanner;

public class lib_fine {
	private int id;
	private int oddays;
	
	public void setid(int id) {
		this.id=id;
	}
	public void setoddays(int oddays) {
		this.oddays = oddays;
	}
	public int getid() {
		return id;
	}
	public int getoddays() {
		return oddays;
	}
	
	// fine methods
	//1 fine
	public int fine(int days) {
		return days*5;
	}
	//2 fine
	public int fine() {
		return 10;
	}
	//3 fine
	public int daysfine(int days) {
		return (days*5)+10;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the book id :");
		int id = sc.nextInt();
		System.out.println(" enter the over dues : ");
		int oddays = sc.nextInt();
		
		lib_fine lf = new lib_fine();
		lf.setid(id);
		lf.setoddays(oddays);
		
		System.out.println("enter the days2 fine");
		int day2 =sc.nextInt();
		System.out.println("enter the dummy fine");
		int dummy = sc.nextInt();
		System.out.println("enter the day3 fine");
		int day3 = sc.nextInt();
		
		System.out.println(lf.fine(day2));
		System.out.println(lf.fine());
		System.out.println(lf.daysfine(day3));
		System.out.println(lf.getid());
		System.out.println(lf.getoddays());
		sc.close();		
	}
}
