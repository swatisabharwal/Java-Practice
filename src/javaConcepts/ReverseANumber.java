package javaConcepts;

import java.util.Arrays;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO function to reverse a number 
		long num = 651434;
		long rev=0;
		long temp=0;
		
		while (num!=0) {
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		
	}
		System.out.println(rev);

	}
}
