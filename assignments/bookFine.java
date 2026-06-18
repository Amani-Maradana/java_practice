package assignments;
import java.util.Scanner;
public class bookFine {
	private int bookID;
	private int overDue;
	
	public int getbookID() {
		return bookID;
	}
	public void setbookID(int bookID) {
		this.bookID = bookID;
	}
	
	public int getoverDue() {
		return overDue;
	}
	public void setoverDue(int overDue) {
		this.overDue = overDue;
	}
	
	public int fine(int days) {
		int fine = days*5;
		if(fine>5000) {
		fine = 5000;
		}
		return fine;
	}
	
	public int fine() {
		return 10;
	}
	
	public int fine(int days, int fixedfine) {
		int fine = days*5 +fixedfine;
		if(fine>5000) {
			fine = 5000;
		}
		return fine;
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		if(sc.hasNextInt()) {
			int id = sc.nextInt();
			int oddays = sc.nextInt();
			int days2 = sc.nextInt();
			int dummy = sc.nextInt();
			int day3 = sc.nextInt();
			int fixedfine = 10;
			bookFine calc = new bookFine();
			
			calc.setbookID(id);
			calc.setoverDue(oddays);
			
			System.out.println(calc.fine(days2));
			System.out.println(calc.fine());
			System.out.println(calc.fine(day3,fixedfine));
			System.out.println(calc.getbookID());
			System.out.println(calc.getoverDue());
			
		}

	}

}
