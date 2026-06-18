package assignments;

import java.util.Scanner;

public class hardware {

	private int base ;

	public hardware(int base) {
		super();
		this.base = base;
	}
	
	public int getbase() {
		return base;
	}
	
	public void setbase(int base) {
		this.base = base;
	}
}

class adder extends hardware {
	private int add ;
	public adder(int base, int add) {
		super(base);
		this.add = add;
	}
	
	public int getadd() {
		return add+getbase();
	}
}

class multiplier extends adder{
	private int mul ;
	public multiplier(int base, int add, int mul) {
		super(base,add);
		this.mul = mul;
		
		if(mul<0) {
			this.mul = 0;
		}
		else {
			this.mul = mul * getadd();
		}
	}
	

	
	public int getmul() {
		return mul;
	}
	
	
	
}

class Main extends multiplier {
	public Main(int base, int add, int mul) {
		super(base, add, mul);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int add = sc.nextInt();
		int mul = sc.nextInt();
		
		multiplier m1 = new multiplier(base,add,mul);
		
		System.out.println(" the output is : "+m1.getmul());
	}
}


