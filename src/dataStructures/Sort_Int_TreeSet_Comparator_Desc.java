package dataStructures;

import java.util.Comparator;
import java.util.TreeSet;

 class Sort_Int_TreeSet_Comparator_Desc implements Comparator {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Sort_TreeSet_Using_Comparator_Desc customisedSort = new Sort_TreeSet_Using_Comparator_Desc() this is a right way too
		TreeSet <Integer> tree= new TreeSet<Integer>(new Sort_Int_TreeSet_Comparator_Desc());
		   tree.add(47 );
		    tree.add(7 );
		    tree.add(67 );
		    tree.add(27 );
		    tree.add(77 );
		    tree.add(37 );
		    tree.add(17 );
		    tree.add(57 );
		    tree.add(77 );
		    tree.add(00 );
		    System.out.println("tree in order "+tree);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO This method will customize the sorting order to Descending
		
		Integer i1= (Integer) o1; // newly added
		Integer i2= (Integer) o2; //already existing 
		if(i1<i2) {      //o1=7 o2=47 // if true o1 will come after o2 hence result +ve 
			return +4;
		}
		else if (i1>i2) {
			return -1;
		}
		return 0;
	}

}
