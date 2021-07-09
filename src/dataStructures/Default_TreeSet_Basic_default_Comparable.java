package dataStructures;

import java.util.TreeSet;

public class Default_TreeSet_Basic_default_Comparable{

	public static void main(String[] args) {
		// TODO 1. Default TreeSet > meaning that elements you are adding should be homogeneous and Comparable .
		//String and other wrapper classes implements Comparable interface
		//the only method in comparable interface is compareTo() 
		
		 TreeSet<String> tree = new TreeSet<String>();
		    //tree.add(null);
		    tree.add("k");
		    tree.add("o");
		    tree.add("n");
		    tree.add("m");
		    tree.add("l");
		    tree.add("lAlItA");
		    tree.add("K");
		    tree.add("Swati");
		    System.out.println("A".compareTo("Z")); //-ve
		    System.out.println("Z".compareTo("Z")); // 0
		    System.out.println("Z".compareTo("A")); //+ve
		    System.out.println("Z".compareTo("a")); //-ve
		   // System.out.println("Z".compareTo(null)); //null point
		    
		    System.out.println(tree);
		    
	}

}
