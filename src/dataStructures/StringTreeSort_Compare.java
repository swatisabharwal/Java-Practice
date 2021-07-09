package dataStructures;

import java.util.Comparator;
import java.util.TreeSet;

public class StringTreeSort_Compare implements Comparator<Object> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> tree = new TreeSet<String>(new StringTreeSort_Compare());
		    tree.add("Kelly");
		    tree.add("Om");
		    tree.add("Nap");
		    tree.add("Queen");
		    tree.add("Swati");
		    tree.add("Swati");
		    tree.add("SAM");
		    tree.add("swati");
		    System.out.println(tree);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String str1 = (String) o1;                                                    //any casting will work 
		String str2 = o2.toString();
	//return str1.compareTo(str2);        //alphabetical order
		return str2.compareTo(str1);        //Reverse Alphabetical Order  
	}

}
