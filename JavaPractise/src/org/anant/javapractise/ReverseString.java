package org.anant.javapractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class ReverseString {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string to be reversed");
		String inputStr = br.readLine();
		String outputStr = "";
		char[] str = inputStr.toCharArray();
		for (int i = str.length - 1; i >= 0; i--) {
			outputStr = outputStr + str[i];
		}
		for (int i = 0; i <= outputStr.length() - 1; i++) {
			System.out.print(outputStr.charAt(i));
		}
	}

}
