package leetCode_Amazon;

import java.util.ArrayList;

public class RunningSumOfArray {
	public int[] runningSum(int[] nums) {
		int sum=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			sum= sum+nums[i];
			al.add(sum);	
		}
		System.out.println("al:"+ al);
		nums = al.stream().mapToInt(i -> i).toArray();
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningSumOfArray sol = new RunningSumOfArray();
		int[] arr = { 1,1,1,1 };
		int[] solarr = sol.runningSum(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print( solarr[i]);
		}
	}

}
