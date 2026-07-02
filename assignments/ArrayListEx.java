package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();

		while (sc.hasNext()) {
			String word = sc.next();
			boolean isalphabet = true;

			for (int i = 0; i < word.length(); i++) {
				if (!Character.isLetter(word.charAt(i))) {
					isalphabet = false;
					break;
				}
			}
			if (!isalphabet) {
				break;
			}
			words.add(word);
		}

		Collections.sort(words);

		for (String w : words) {
			System.out.println(w);
		}
		sc.close();
	}
}
