package javaConcepts;

import java.util.Scanner;

public class FortuneTellerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput=0;
		System.out.println("Pick a number from 1 to 10");
		Scanner input=new Scanner(System.in);
		userInput=input.nextInt();
		System.out.println(userInput);
			
		while(userInput<=10) {
			if(userInput<5) {
				System.out.println("You are in GOOD Luck");
				break;
			}
			else if (userInput>=5) {
				System.out.println("Even better Luck");
				break;
			}
	
		}
	
	}

}
