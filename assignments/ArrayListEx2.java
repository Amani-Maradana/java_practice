package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> originallist = new ArrayList<>();
		ArrayList<Integer> uniquelist = new ArrayList<>();

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				
				int num = sc.nextInt();
				originallist.add(num);
				
				if (!uniquelist.contains(num)) {
					uniquelist.add(num);
				} 
			}
			else{
				break;
			}

		}
		System.out.println("Original list :");
		for (int o : originallist) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println("after removing duplicate elements");
		for (int u : uniquelist) {
			System.out.print(u+" ");
		}
		System.out.println();


	}

}
