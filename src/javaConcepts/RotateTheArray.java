package javaConcepts;

public class RotateTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,2,7,9,22,-12};// 792242
		int k=3;
	//	System.out.print("arr length -1>>>>>"+ arr[arr.length-1]);
		while(k>0) {
			int temp =arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
				
				}
			arr[0]=temp;
			k--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

}
