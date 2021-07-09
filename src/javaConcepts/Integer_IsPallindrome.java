package javaConcepts;
import java.util.Scanner;
public class Integer_IsPallindrome {

	public static void main(String[] args) {
		// TODO Java code to identify a number as Palindrome
		
		Scanner scn =new Scanner(System.in);
		int cool=0;
		
	
		int rev=0;
		int temp=0;
		System.out.println("Enter a freaking Number:" );
		try {
		 cool = scn.nextInt();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is handled > Enter an Integer");
		}
		int input=cool;
		while(input!=0) {
	
		temp=input%10;
		rev=rev*10+temp;
		input=input/10;
		}
		System.out.println("rev="+rev);

		
		if (rev==cool) {
			System.out.println("Number is a pallindrome");
		}
			else
				System.out.println("YOU SUCK");
		}
	}


