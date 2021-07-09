package dataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListOperator {

	public static void main(String[] args) {
		// TODO ListIterator on Linked List

		LinkedList<Integer> al = new LinkedList<Integer>();
		for (int i = 2; i < 10; i++) {
			al.add(i);
		}

		System.out.println(al);

		ListIterator lit = al.listIterator();
		System.out.println("Implementing class of the iterator >"+ lit.getClass().getName());
		while (lit.hasNext()) {
			Integer i = (Integer) lit.next();
			if (i == 8) {
				lit.remove();
			} else if (i == 4) {
				lit.add(777);
			}
		}
		System.out.print(al);

	}

}
