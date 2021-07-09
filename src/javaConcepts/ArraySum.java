package javaConcepts;

public class ArraySum {

	public static void main(String[] args) {
		// Method which accepts Array and returns sum of all the elements in array
		int arr[] = {4,7,10,546,93};
		int sum =0;
		for(int i =0;i<5;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
		

	}

}
