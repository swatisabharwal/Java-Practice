package dataStructures;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSort_ByLength_NonComparableObjects implements Comparator<Object> {

	public static void main(String[] args) {
		/*
		 * TODO Sort the Tree, with following  Rules:
		 *  1. Sort by Increase in length
		 *  2.  If same length then alphabetically
		 */
		
		TreeSet <Object> t = new TreeSet<Object>(new TreeSort_ByLength_NonComparableObjects()) ;
		t.add("A");
		t.add(new StringBuffer("Abc"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
		
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = o1.toString();
		String str2 = o2.toString();
		if(str1.length()>str2.length()) {
			return +1;
		}
		else if(str1.length()<str2.length()) {
			return -1;
		}
		else if(str1.length()==str2.length()) {
			return str1.compareTo(str2);
		}
		return 0;
	}

}
