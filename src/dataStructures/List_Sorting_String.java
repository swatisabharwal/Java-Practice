package dataStructures;
import java.util.ArrayList;
import java.util.Collections;

public class List_Sorting_String {

	public static void main(String[] args) {
		// TODO sort the list of strings using Java collection
		long startTime = System.nanoTime();
		
		
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		ArrayList <String> aList=new  ArrayList<String>();
		for(String i : inputList) {
			aList.add(i.toLowerCase());
		}
		Collections.sort(aList);
		
		System.out.println("Sorted List "+ aList);
		
	
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

	}
	

}
