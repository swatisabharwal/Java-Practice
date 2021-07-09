package javaConcepts;

import java.util.Arrays;

public class Largest2Numbers_From_Array {

	public static void main(String[] args) {
		// TODO Write a Java program to find out the first two max values from an array?
	
		int[] arr = {72, -22,432,766, 12, 345};
		int max=0;
		int max2=0;
		int max3=0;
		for(int i=0;i<arr.length;i++) {
		max=Math.max(max, arr[i]);	
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max) {
				max2= Math.max(arr[i], max2);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max&&arr[i]!=max2) {
				max3= Math.max(arr[i], max3);
			}
		}
		System.out.println("Largest: " +max);
		System.out.println("2nd Largest: " +max2);
		System.out.println("3rd largest:"+max3);
	}

}
