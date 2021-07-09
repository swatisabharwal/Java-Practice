package javaConcepts;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO check prime no.
		int input = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		input = scn.nextInt();
		boolean flag = false;

		for (int i = input - 1; i > 1; i--) {

			if (input % i == 0) {
				System.out.println(input + " is Not a Prime number");
				flag = false;
				break;

			} else {
				flag = true;
			}
		}

		if (flag == true) {
			System.out.println("Poor Prime");
		}

	}

}
