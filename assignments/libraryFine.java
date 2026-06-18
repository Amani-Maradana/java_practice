package assignments;

import java.util.Scanner;

public class libraryFine {
	
	private int odDays;
	private int ID;
	
	public int getId() {
		return ID;
	}
	public int getodDays() {
		return odDays;
	}
	
	public void setID(int ID) {
		this.ID= ID;
	}
	public void setodDays(int odDays) {
		this.odDays= odDays;
	}
	
	public int fine(int odDays) {
		int fine = odDays *5;
		if(fine>1000) {
			fine = 1000;
		}
		else {
			fine = fine;
		}
		return fine;
	}
	
	public int fine() {
		int fine = 10;
		return fine;
	}
	
	public int fine(int odDays, int fc) {
		int fine = odDays*5 + fc;
		if(fine>1000) {
			fine = 1000;
		}
		else {
			fine = fine;
		}
		return fine;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		int oddays = sc.nextInt();
		int day2 = sc.nextInt();
		int dummy = sc.nextInt();
		int day3 = sc.nextInt();
		int fc = 10;
		
		libraryFine lf = new libraryFine();
		
		lf.setID(ID);
		lf.setodDays(oddays);
		
		System.out.println("fine by days  : "+lf.fine(day2));
		System.out.println("fixed fine : "+lf.fine());
		System.out.println("fine with fixed charges : "+lf.fine(oddays,fc));
		System.out.println("BookID : "+lf.getId());
		System.out.println("Over due days : "+lf.getodDays());
		
		
	

	}

}
