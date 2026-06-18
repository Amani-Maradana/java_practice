package assignments;
import java.util.Scanner;
public class occurenceFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter thr string :");
		String input = sc.nextLine();
		System.out.println("enter thr target character :");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i<input.length(); i++) {
			if(ch == input.charAt(i)) {
				count++ ;
			}
			
		}
		System.out.println("the occurence of "+ch+" in the string '"+input+"' is "+count+" times");
	
	}

}
