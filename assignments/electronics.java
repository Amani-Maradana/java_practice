package assignments;
import java.util.Scanner;
class electronics {
	public electronics() {
		System.out.println("Electronics initialized ");
	}
	
	// main class
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the brand");
		String brand = sc.nextLine();
		System.out.println("enter the capacity ");
		int capacity = sc.nextInt();
		SmartDevice sm = new SmartDevice(brand , capacity);
		sc.close();
	}
	
}

class devices extends electronics{
	String brand;

	public devices(String brand) {
		super();
		this.brand = brand;
		System.out.println("Device initialized : "+this.brand);
	}
}

class SmartDevice extends devices{
	int capacity;
	public SmartDevice(String brand,int capacity) {
		super(brand);
		this.capacity= capacity;
		System.out.println("SmartDevice initialized "+this.capacity+"GB");
	}
	
	
}