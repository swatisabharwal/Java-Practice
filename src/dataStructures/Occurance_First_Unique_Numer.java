package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class Occurance_First_Unique_Numer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {3,3,6,3,6,6,1,7};
		    int n = arr.length;
		    
		        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		        for (int i = 0; i < n; i++) {
		          if(!m.containsKey(arr[i]))
		             {
		            m.put(arr[i], 1);
		              System.out.println("else "+ m);
		             }
		         else  {
		                m.put(arr[i], m.get(arr[i]) + 1);
		              System.out.println("if "+ m);
		               }
		            //(m.containsKey(arr[i]))
		        }
		    System.out.println(m);
		    
		     
		        for (int i = 0; i < n; i++)
		            if (m.get(arr[i]) == 1){
		              System.out.println(arr[i]);
		              break;
		            }
	}

}
