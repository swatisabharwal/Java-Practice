package leetCodes_LevelEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Decompress_Run_Length_Encoded_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: nums = [1,2,3,4] Output: [2,4,4,4] Explanation: The first pair [1,2]
		 * means we have freq = 1 and val = 2 so we generate the array [2]. The second
		 * pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4]. At the
		 * end the concatenation [2] + [4,4,4] is [2,4,4,4].
		 */
		Decompress_Run_Length_Encoded_List sol = new Decompress_Run_Length_Encoded_List();
		int[] nums = { 1, 1, 2, 3 };
		int[] array = sol.decompressRLElist(nums);
		System.out.println("Array: " + Arrays.toString(array));

	}

	public int[] decompressRLElist(int[] nums) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for (int i : nums) {
			al1.add(Integer.valueOf(i));
		}
		System.out.println("AL1::" + al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		for (int i = 0; i < nums.length - 1; i += 2) {
			int ind = nums[i];
			while (ind > 0) {
				al2.add(al1.get(i + 1));
				ind--;

			}
		}
		System.out.println("al2:: " + al2);
		int[] x = al2.stream().mapToInt(i -> i).toArray();
		// System.out.println("X:= "+Arrays.);



		return x;

	}
}
