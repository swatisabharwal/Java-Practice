package dataStructures;

import java.util.Comparator;
import java.util.TreeSet;

public class SortIntTreeSet_Different_CompareImplementations implements Comparator<Object> {

	public static void main(String[] args) {
		SortIntTreeSet_Different_CompareImplementations TreeSet_Sort = new SortIntTreeSet_Different_CompareImplementations();
		// TODO Auto-generated method stub
		TreeSet<Integer> tree = new TreeSet<Integer>( TreeSet_Sort);
		tree.add(47);
		tree.add(7);
		tree.add(67);
		tree.add(27);
		tree.add(77);//
		tree.add(37);
		tree.add(17);
		tree.add(57);
		tree.add(77);//
		tree.add(00);

		System.out.println("Tree in order " + tree);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO will just use ComareTO method - which is available for default sorting
		// and will get descending order
		Integer i1 = (Integer) o1; // newly added
		Integer i2 = (Integer) o2; // already existing

		// Some Return example
		// return -i1.compareTo(i2); 			//Descending
		return i2.compareTo(i1); 				// descending
		// return i1.compareTo(i2); 			//ascending
		// return -i2.compareTo(i1);			 //ascending
		// return +1; 										// insertion order and no comparison
		// return -1;										 // Reverse insertion order and no comparison
		// return 0; 										// Only first element , all other elements will be considered as duplicates
	}

}
