package dataStructures;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class CakeTrouble {
	  public  int cakeTrouble(int N, int K, int[] A, int[] B, int[] C) {
	        // write your code in Java SE 8
	    	TreeSet<Integer> hs=new TreeSet<Integer>();
	    	for(int i :A) {
	    		hs.add(i);
	    	}
	    	for(int i :B) {
	    		hs.add(i);
	    	}
	    	for(int i :C) {
	    		hs.add(i);
	    	}
	    	System.out.println("The Cake Row:"+hs.size());
//	    	Stack <Integer> s = new Stack<Integer>();
//	    	for(Integer i: hs) {
//	    		if(i==)
//	    		
//	    		
//	    	}
	    	
	    		return 0;
	    }


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int N=5;
			int K=3;
			int[] A= {1, 1, 4, 1, 4};
			int[] B= {5, 2, 5, 5, 4};
			int[] C= {1, 2, 2, 3, 3};
			CakeTrouble sol = new CakeTrouble();
			int r=sol.cakeTrouble(N,K,A,B,C);
			System.out.println(r);
		}

}
