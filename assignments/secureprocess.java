package assignments;
import java.util.Scanner;
abstract class secureprocess {
	final void logAccess(String username) {
		System.out.println("Access logged for : ");
	}
	
	abstract void executeAction(int priority);
	
	//main class
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		secureprocess sp = new Usertask();
		System.out.println("enter you name and id : ");
		String username = sc.next();
		int priority = sc.nextInt();
		
		sp.logAccess(username);
		sp.executeAction(priority);
		

	}

}

class Usertask extends secureprocess{
	void executeAction(int priority) {
		if(priority>10) {
			System.out.println("High Priority");
		}
		else {
			System.out.println("Low Priority");
		}
	}
}
