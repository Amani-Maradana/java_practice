package assignments;
import java.util.Scanner;

public class perfect_square_checker {
	    public static void main(String [] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        boolean ps = false;
	        for(int i = 0 ;i <= n;i++){
	            if(n == (i*i)){
	                ps = true;
	            }
	        }
	        if(ps){
	            System.out.println("Perfect Square");
	        }
	        else{
	            System.out.println("Not Perfect Square");
	        }
	    }
	

}
