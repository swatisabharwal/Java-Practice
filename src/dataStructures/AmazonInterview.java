package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class AmazonInterview {

	public static void main(String[] args) {
		// TODO Count Occurrences of each character
		String str= "aaabcccdeeef";
		char[] ch= str.toCharArray(); 
		ArrayList<Character> li = new ArrayList<Character>();
		for(char i: ch) {
			li.add(i);
		}
		
		Map<Character, Integer> ma= new HashMap<Character, Integer>();
		for(Character i:li) {
			Integer c =ma.get(i);
			ma.put(i, (c==null)? 1: c+1);
		}
		for(Map.Entry<Character,Integer> val:ma.entrySet()) {
			System.out.println("Element:: "+ val.getKey()+ "Count ::"+val.getValue());
		}
		 
		
	//	System.out.println(li);
	}

}
