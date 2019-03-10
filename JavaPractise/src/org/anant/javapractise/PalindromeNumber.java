package org.anant.javapractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number");
		int newNo = 0, lastDigit, divideNo;
		BufferedReader obj = new BufferedReader(
				new InputStreamReader(System.in));
		String inputStr = obj.readLine();
		int inputNo = Integer.parseInt(inputStr);
		int checkNo = inputNo;
		for (int i = 0; i < inputStr.length(); i++) {
			lastDigit = inputNo % 10;
			newNo = (newNo * 10) + lastDigit;
			inputNo = inputNo / 10;
		}
		if (newNo == checkNo)
			System.out.println("Number : " + checkNo + " is palindrome number");
		else
			System.out.println("Number : " + checkNo
					+ " is not a palindrome number");
	}

}
