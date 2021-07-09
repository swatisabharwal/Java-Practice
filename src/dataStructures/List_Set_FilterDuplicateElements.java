package dataStructures;

import java.util.ArrayList;
import java.util.HashSet;

public class List_Set_FilterDuplicateElements {

	public static void main(String[] args) {
		// TODO Filter duplicate elements from an array and print as a list
		
		ArrayList<Integer> aList = new  ArrayList<Integer>();
		aList=	makeTestData(aList);
		
		System.out.println("List with Duplicate Elements"+ aList);
		HashSet<Integer> hashSet= new HashSet<Integer>();
		
		for(int i: aList) {
			hashSet.add(i);	
		}
		System.out.println("Filtered List "+ hashSet);
		
	}
	
	public static ArrayList<Integer> makeTestData(ArrayList<Integer>list){
		for(int i =1;i<=10;i++) {
			list.add(i);
		}
		for(int j=1;j<=5;j++) {
			list.add(j);
		}
		return list;
	}
}

