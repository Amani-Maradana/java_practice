package assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class MapExample {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> wordlist = new ArrayList<>();
		System.out.println("enter:");
		
		if(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] token = line.split("\\s+");
			for(String s : token) {
			wordlist.add(s);
			}
		}
		Collections.sort(wordlist);
		
		Map<Character,List<String>> groupmap = new LinkedHashMap<>();
		for(String word:wordlist) {
			char fc = word.charAt(0);
			if(!groupmap.containsKey(fc)) {
				groupmap.put(fc, new ArrayList<>());
			}
			groupmap.get(fc).add(word);
			
		}
		System.out.println(groupmap);
		sc.close();
	}

}
