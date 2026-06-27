package assignments;
import java.util.Scanner;
public class e1 {
	public static int complexOperation(String str, int index) throws Exception{
		int result = -1;
		try {
			int num = Integer.parseInt(str);
			int[] arr = new int[1];
			arr[0]= num;
			
			if(index<0||index>arr.length) {
				throw new ArrayIndexOutOfBoundsException("Invalid index");
			}
			result = arr[index];
		}
		catch(NumberFormatException| ArrayIndexOutOfBoundsException e) {
			result = -1;
		}
		finally {
			//always exceuted
		}
		return result;
	}
	
	public static void maiin(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		int index = sc.nextInt();
		
		try {
			System.out.println(complexOperation(str,index));
		}
		catch(Exception e) {
			System.out.println(-1);
		}
	}
}
