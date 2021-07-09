package leetCodes_LevelEasy;

public class SortByParity {

	 public int[] sortArrayByParity(int[] nums) {
		 int[] arr= new int[nums.length];
		 int start=0;
		 int end = nums.length-1;
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]%2==0) {
				 arr[start]=nums[i];
				 start++;
			 }
			 else {
				 arr[end]=nums[i];
				 end--;
			 }
		 }
		return arr;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortByParity sol = new SortByParity();
			int[] arr = { 6,3,3,8,1,45,2 };
			int[] solarr = sol.sortArrayByParity(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(solarr[i]);
			}

	}

}
