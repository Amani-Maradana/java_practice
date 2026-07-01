package assignments;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}
	
	public static void main(String[] args) {
		TreeSet <String>treeset = new TreeSet<>(new TreeSetExample());
		treeset.add("amani");
		treeset.add("jahnavi");
		treeset.add("swathi");
		treeset.add("chalam");
		System.out.println(treeset);

	}

}
