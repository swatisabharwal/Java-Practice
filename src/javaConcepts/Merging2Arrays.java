package javaConcepts;
import  java.util.ArrayList;
public class Merging2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {6,4,5,7,8,4};
		int[]arr2 = {1,2,3,4,5};

		ArrayList <Integer>list= new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			list.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			list.add(arr2[i]);
		}
		System.out.println(list);
	   }
	}