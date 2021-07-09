package javaConcepts;

public class fibbonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7; // =>0,1,1,2,3,5,8,13,21
		int a = 0;
		int b = 1;
		int i = 1;
		int sum=0;
		while (i < 8) {
			sum =a+b;
			
			a=b;
			b=sum;
			i++;
			System.out.print(sum+",");
		}
		
	}

}
