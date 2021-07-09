package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_withArrayList_Share_OddPrime {
	// TODO This iterator will iterate through an array list and print non prime ODD
	// numbers

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 2; i < 22; i++) {
		//	if (i % 2 != 0) {
				al.add(i);
		//	}
		}
		System.out.println(al);

		Iterator it = al.iterator();
		
		while (it.hasNext()) {
			Integer notPrime = (Integer) it.next();
			if(notPrime%2==0) {
				it.remove();
			}
			else { 
			for (int i = notPrime - 1; i > 1; i--) {
				if (notPrime % i == 0) {
					System.out.println("Not Prime Odd numbers: " + notPrime);
					break;
				}
			}
			}
		}

	}

}
