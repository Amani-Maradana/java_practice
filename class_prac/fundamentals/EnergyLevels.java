package com.codegnan.fundamentals;
import java.util.Scanner;
public class EnergyLevels {

	public static void main(String[] args) {
		Scanner sc = new Scanner ("System.in");
		if(sc.hasNextInt()) {
			int s = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			int totalsum = 0;
			int processedcount = 0;
			for (int i = s; processedcount<n; i++) {
				if (i % k ==0) {
					continue;
					}
				totalsum += i;
				processedcount++;
				
				if(totalsum <=m) {
					break;
				}
				
			}
			
			
		}

	}

}
