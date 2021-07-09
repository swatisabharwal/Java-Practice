package dataStructures;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapsAndBasic {

	public static void main(String[] args) {
		// TODO Map and its basic functions
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(34, "bhw");
		map.put(22, "lig");
		map.put(232, "lig");
		System.out.println(" map:" + map);
		System.out.println("Replaced Object :: " + map.put(34, "guel"));
		System.out.println("New  map:" + map);
		System.out.println("New  map:" + map.isEmpty());
		System.out.println("New  map:" + map.containsKey(34));
		Set<Integer> hs = map.keySet();
		System.out.println("Keyset:: " + hs);
		Collection col = map.values();
		System.out.println(col);
		System.out.println("entrySet:: " + map.entrySet());
		
		
	}

}
