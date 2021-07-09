package javaConcepts;

import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MyAge = 29;
		int count =0;
		String MyName = "Swati             Sabharwal                              ";
		String Salutation = "Miss ";
//		System.out.println(MyName.length()+MyName);
//		System.out.println(MyName.trim().length()+ MyName.trim());
		
		String arr[] =	MyName.split(" ", 2) ;
	
		StringBuilder sb = new StringBuilder(arr[0].toString().trim());
		System.out.println(sb.append(" "+arr[1].toString().trim()));
		
		
		
		
		
		//Builder and Scanner => builder better than conactination variable count and scanner for the user input
/*		StringBuilder sp = new StringBuilder(MyName).append(" is my NAme");
		System.out.println(sp);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		
		
		System.out.println("the Entry>" + sp.append("\n"+input+"\n"));
		
	*/

		/*
		 * String name ="Swati"; name="Sabharwal"; Integer n =7; String ns
		 * =n.toString(); System.out.println(ns); System.out.println(name);
		 * 
		 * System.out.println(MyName.charAt(7));
		 * System.out.println(MyName.substring(3,7));
		 * System.out.println(Salutation+MyName+MyAge);
		 */
	}

}
