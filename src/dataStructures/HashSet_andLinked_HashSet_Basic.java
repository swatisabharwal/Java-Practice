package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_andLinked_HashSet_Basic {

	public static void main(String[] args) {
		// TODO Basic Hash Set functions and print : to prove heterogeneous elements are
		// allowed, insertion order is not preserved etc.
		//Simiar to linked hash set => where everything remains same except insertion order is preserved 

		HashSet<Object> h = new HashSet<Object>();
		h.add('a');
		h.add('A');
		h.add(7);
		h.add("Hello");
		h.add(null);
		h.add(0.2);

		System.out.println("Set: " + h);
		System.out.println("Adding original: " + h.add('k'));
		System.out.println("new Set: " + h);
		System.out.println("Adding Duplicate: " + h.add(7));
		
		LinkedHashSet<Object> linkdh = new LinkedHashSet<Object>();
		linkdh.add('a');
		linkdh.add(7);
		linkdh.add("Hello");
		linkdh.add(null);
		linkdh.add(0.2);

		System.out.println("\n Linked Hash Set : " + linkdh);
		System.out.println("Adding original to Linked Hash Set : " + linkdh.add('k'));
		System.out.println("new Linked Hash Set : " + linkdh);
		System.out.println("Adding Duplicate to Linked Hash Set : " + linkdh.add(7));

	}

}
