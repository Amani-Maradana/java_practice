package assignments;

import java.util.Scanner;

class msc {

	int power;
	public msc(int base) {
		this.power = base;
	}
	
}

class engine extends msc {
	public engine(int base, int eng) {
		super(base);
		this.power += eng;
	}
	
}

class drill extends engine{
	private int dri;

	public drill (int base, int eng,int dri) {
		super(base,eng);
		this.dri = dri;
	}
	
	public int getdri() {
		return this.power += this.dri;
	}
	
	class Main{
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			int base = sc.nextInt();
			int eng = sc.nextInt();
			int dri = sc.nextInt();
			
			drill d1 = new drill(base,eng,dri);
			
			System.out.println(" the output is : "+d1.getdri());
		}
	}
}




