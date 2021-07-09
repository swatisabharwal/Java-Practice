package dataStructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_EntryInterface {

	public static void main(String[] args) {
		// TODO Working with Hash map and Iterator and Entry Interface and basic methods

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hi");
		map.put(2, "Hola");
		map.put(3, "Salut");
		map.put(4, "Namaste");
		map.put(5, "Salut");
		// Iteration through Iterator
		Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Entry<Integer, String> entry = entries.next();
			if (entry.getKey() ==2) {
				System.out.println("Replaced Value::" + entry.setValue("Hola Amigo"));

			}
	
		}
		System.out.println("New Mp:: " + map);
		// Iteration through For Each
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getKey() == 5) {
				System.out.println("Replaced Value::" + entry.setValue("Bonjour"));
				System.out.println("Newer Map:: " + map);
			}
		}
	}
}
