package javaConcepts;

import java.util.Arrays;

public class TwoStringsAnagram {
	public static void main(String[] a) {
		String str1 ="Listen";
		String str2 ="Silent";
		
	
		
		if(str1.length()!=str2.length()) {
			System.out.println("String ISNT anagram");
		}
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		 char[]  arr =str1.toCharArray();
		 char[]  arr2 =str2.toCharArray();
		 
		
		 Arrays.sort(arr);
		 Arrays.sort(arr2);
		 boolean isitAnagram = checkAnagram(arr,  arr2);
		 System.out.println("isitAnagram:: "+isitAnagram);
	}
		
	
	
	static boolean checkAnagram(char[] arr, char[] arr2) { 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]!=arr2[i]) {
				return false;
			 }
		 }
		 return true;
		 }
	}


