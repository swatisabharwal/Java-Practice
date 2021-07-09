package javaConcepts;

public class SortIntArrayWithoutCokllection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,2,6,1,4,9,-16};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println("\n: descending ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+",");
		}
	}

}
