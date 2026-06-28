package assignments;
import java.util.Scanner;

public class quadrilateral_checker {
	    public static void main(String [] args){
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c= sc.nextInt();
	        int d = sc.nextInt();
	        if(a==c&&a==c&&a==d){
	            System.out.println("Square");
	        }
	        else if( a== c&&b==d){
	            System.out.println("Rectangle");
	        }
	        else{
	            System.out.println("Other");
	        }
	    }
	

}
