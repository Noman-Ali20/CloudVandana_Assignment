package com.cloudvandana.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first word: ");
		String input1 = sc.nextLine(); // Use nextLine() to handle spaces
		System.out.print("Enter second word: ");
		String input2 = sc.nextLine(); // Use nextLine() to handle spaces

		sc.close(); // Close the scanner

		if (isAnagram(input1, input2)) {
			System.out.println("It is an Anagram");
		} else {
			System.out.println("Not an Anagram");
		}
	}

	private static boolean isAnagram(String input1, String input2) {
		input1 = input1.toLowerCase().replaceAll("\\s", ""); // Remove spaces and convert to lowercase
		input2 = input2.toLowerCase().replaceAll("\\s", ""); // Remove spaces and convert to lowercase

		if (input1.length() != input2.length()) {
			return false; // If lengths don't match, they can't be anagrams
		}

		char[] c1 = input1.toCharArray();
		char[] c2 = input2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		return Arrays.equals(c1, c2);
	}
}
