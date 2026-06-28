package assignments; 

import java.util.Scanner; 

public class Number_Bracket_Classifier { 
    public static void main(String [] args){ 
        Scanner sc = new Scanner(System.in); 
        int i = sc.nextInt(); 
        
        if(i < 10001){ 
            System.out.println("0"); 
        } else if(i < 50001){ 
            System.out.println("10"); 
        } else if(i < 100010){ 
            System.out.println("20"); 
        } else { 
            System.out.println("30"); 
        } 
        
        sc.close(); 
    } 
}
