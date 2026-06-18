package assignments;
import java.util.Scanner;
public class removeduplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string :");
		String input = sc.nextLine();
		 String result = "";
		 
		 for(int i = 0; i<input.length();i++) {
			 char ch = input.charAt(i);
			 
			 if(result.indexOf(ch) == -1) {
				 result+=ch;
			 }
			 
		 }
		System.out.println(" Result : "+result);
		sc.close();

	}

}
