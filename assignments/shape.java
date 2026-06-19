package assignments;

import java.util.Scanner;

class shape {
	public int process(int n) {
		if (n < 0) {
			return 0;
		} else {
			return n;
		}
	}
	
	public static void main(String[] args ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("shape --> B");
		System.out.println("circle --> C");
		System.out.println("square --> S");
		System.out.println("enter the type : ");
		char type = sc.next().toUpperCase().charAt(0);
		
		shape p;
		System.out.println("enter the value : ");
		int value = sc.nextInt();
		
		if(type == 'B') {
			p = new shape();
		}
		else {
			if(type == 'C') {
				p = new circle();
			}
			else {
				p = new square();
			}
		}
		System.out.println(p.process(value));
		
	}
	
}

class circle extends shape {
	public int process(int n) {
		if (n < 0) {
			return 0;
		} else {
			return n * 2;
		}
	}
}

class square extends shape {
	public int process(int n) {
		if(n<0) {
			return 0;
		}
		else {
			return n*n;
		}
	}
}
