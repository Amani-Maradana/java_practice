package assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionwithStream {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elemnents for set 1:");
		String i1 = sc.nextLine();
		System.out.println("enter elements for set2:");
		String i2 = sc.nextLine();
		Set<String> set1 = Arrays.stream(i1.trim().split("\\s+")).collect(Collectors.toSet());
		Set<String> set2 = Arrays.stream(i2.trim().split("\\s+")).collect(Collectors.toSet());
		
		Set<String> result = new HashSet<>(set1);
		result.retainAll(set2);
		
		System.out.println("intersection : "+result);
		sc.close();
	}

}
