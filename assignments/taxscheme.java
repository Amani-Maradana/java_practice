package assignments;
import java.util.Scanner;
class taxscheme {
	public double calculatetax(double income) {
		return income*0.10;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 --> basictax");
		System.out.println("1 --> specialtax");
		System.out.println("enter the tax type : ");
		int n = sc.nextInt();
		
		taxscheme ts;
		double income;
		if(n == 1) {
			ts = new specialtax();
		}
		else {
			ts= new taxscheme();
		}
		System.out.println("enter the no. of incomes : ");
		int j = sc.nextInt();
		double totaltax = 0.0;
		for(int i = 0; i<j;i++) {
			income = sc.nextDouble();
			totaltax += ts.calculatetax(income);
		}
		System.out.println("total tax is : "+totaltax);
		

	}
}
class specialtax extends taxscheme{
	public double calculatetax(double income) {
		
		if(income>5000) {
			return income*0.15;
		}
		else {
			return 0.0;
		}
	}
	
}
