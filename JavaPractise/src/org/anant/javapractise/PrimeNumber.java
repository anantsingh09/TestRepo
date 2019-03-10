package org.anant.javapractise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int count = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number.");
		int inputNumber = obj.nextInt();
		for (int i = 1; i <= inputNumber; i++) {
			if (inputNumber % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("number :" + inputNumber + " is a prime number");
		else
			System.out.println("number :" + inputNumber
					+ " is not a prime number");
	}

}
