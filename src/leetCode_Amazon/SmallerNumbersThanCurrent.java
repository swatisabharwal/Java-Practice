package leetCode_Amazon;

import java.util.ArrayList;


//TODO:: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
//Input: nums = [8,1,2,2,3]		Output: [4,0,1,1,3]
public class SmallerNumbersThanCurrent {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int count=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			count=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					count++;
				}
				
		}
			al.add(count);
		}
		nums =al.stream().mapToInt(i ->i).toArray();
		
		return nums;

	}

	public static void main(String[] args) {

		SmallerNumbersThanCurrent sol = new SmallerNumbersThanCurrent();
		int[] arr = { 6,5,4,8 };
		int[] solarr = sol.smallerNumbersThanCurrent(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(solarr[i]);
		}

	}
}