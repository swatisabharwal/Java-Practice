package leetCodes_LevelEasy;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
	 public String restoreString(String s, int[] indices) {
		 String a="";
		Map<Integer, Character>hs = new HashMap<Integer, Character>();
		for(int i=0;i<indices.length;i++) {
			hs.put(indices[i],s.charAt(i));
		}
	       for(int i=0;i<indices.length;i++) {
	    	   a+=hs.get(i);
	       }
	        return a;

	        
	    }
	
	public static void main(String[] args) {
		//Solution sol = new Solution();
		ShuffleString sol = new ShuffleString();
		int[] indices = {4,5,6,7,0,2,1,3};
		String se= sol.restoreString("codeleet",indices );
		System.out.println(se);
	}

}
