package assignments;
import java.util.Scanner;
public class printVowelsConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String input = sc.nextLine();
		int vc=0;
		int cc=0;
		
		System.out.println("---------vowels----------");
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			
			if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch =='u') {
				System.out.println(ch+" ");
				vc++;
			}
			
		}
		System.out.println("no. of vowels : "+vc);
		
		System.out.println("-----------------consonants-----------------------");
		for(int i = 0; i<input.length();i++) {
			char ch = input.charAt(i);
			
			if(!(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch =='u')) {
				System.out.println(ch +" ");
				cc++;
			}

		}
		System.out.println("no. of consonants count : "+cc);

		sc.close();
	}

}
