package assignments;
import java.util.Scanner;

public class BMIcalc {
	    public static void main(String [] args){
	        Scanner sc = new Scanner(System.in);
	        double w = sc.nextDouble();
	        double h = sc.nextDouble();
	        double bmi = w/(h*h);
	        if(bmi < 18.5){
	            System.out.println("Underweight");
	        }
	        else if(bmi <=24.9){
	            System.out.println("Normal");
	        }
	        else if(bmi <=29.9){
	            System.out.println("Overweight");
	        }
	        else{
	            System.out.println("Obese");
	        }
	    }
	


}
