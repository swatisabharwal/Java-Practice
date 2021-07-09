package dataStructures;

import java.util.Hashtable;

public class HashTable_Basic {
	int i;
	HashTable_Basic(int i) {
		this.i = i;
	}
	public int hashcode() {
		return i;
	}
	public String toString() {
		return i + "";
	}

	public static void main(String[] args) {
		Hashtable ht = new Hashtable(25 );
//		ht.put(new HashTable_Basic(5), "A");
//		ht.put(new HashTable_Basic(2), "B");
//		ht.put(new HashTable_Basic(6), "C");
//		ht.put(new HashTable_Basic(15), "D");
//		ht.put(new HashTable_Basic(23), "E");
//		ht.put(new HashTable_Basic(16), "F");
		ht.put(5 , "A");
		ht.put(2 , "B");
		ht.put(6 , "C");
		ht.put(15 , "D");
		ht.put(23, "E");
		ht.put(16 , "F");
		System.out.println(ht);
		System.out.println(ht.get(15));
	}
}
