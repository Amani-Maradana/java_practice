package assignments;
import java.util.Scanner;

public class traffic_light {
	    public static void main(String [] args){
	        Scanner sc = new Scanner(System.in);
	        String l = sc.next();
	        int t = sc.nextInt();
	        if(l.equals("Green")){
	            System.out.println("Go");
	        }
	        else if(l.equals("Red")){
	            System.out.println("Stop");
	        }
	        else if(l.equals("Yellow")){
	            if(t>=6 && t<=18){
	                System.out.println("Slow");
	            }
	            else{
	                System.out.println("Stop");
	            }
	        }
	    }
	

}
