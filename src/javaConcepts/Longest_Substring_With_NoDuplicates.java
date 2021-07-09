package javaConcepts;
import java.util.HashSet;
import java.util.Iterator;

public class Longest_Substring_With_NoDuplicates {

	public static void main(String[] args) {
		// TODO  longest substring from a given string which doesn’t contain any duplicate characters
		String input ="GEEKSFORGEEKS";
		
	        System.out.println(subString(input));
		}
		
	
	 public static String subString(String input){

	        HashSet<Character> set = new HashSet<Character>();

	        String longestOverAll = "";
	        String longestTillNow = "";

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);

	            if (set.contains(c)) {
	                longestTillNow = "";
	                set.clear();
	            }
	            longestTillNow += c;
	            set.add(c);
	            if (longestTillNow.length() > longestOverAll.length()) {
	                longestOverAll = longestTillNow;
	            }
	        }

	        return longestOverAll;
	    }

}
