package com.codegnan.oopprograming;

public class anagromchecker {

	public static void main(String[] args) {
		String s1 = "eat";
		String s2 = "tea";
		//checking length
		if(s1.length() != s2.length()) {
			System.out.println("not anagroms");
			return;
		}
		boolean isanagram = true;
		//travels each character of first string
		for(int i=0;i<s1.length();i++) {
			//take 1 character from s1
			char ch = s1.charAt(i);
			int count1= 0;
			int count2 = 0;
			for(int j=0;j<s1.length();j++) {
				if(ch == s1.charAt(j)) {
					count1++;
				}
			}
			for(int j = 0;j<s2.length();j++) {
				if(ch == s2.charAt(j)) {
					count2++;
				}
			}
			//compare counts
			if(count1!= count2) {
				isanagram = false;
				break;
			}
		}
		if(isanagram) {
			System.out.println(" is anagram ");
		}
		else {
			System.out.println(" not an anagram");
		}

	}

}
