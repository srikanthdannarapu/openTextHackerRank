package com;

//Java program to output the maximum occurring character 
//in a string 

public class GFG2 {
	static final int CHAR_SIZE = 256;

	static char getMaxOccuringChar(String input) {
		// this array maintain no. of characters and initialize the array as 0
		int characterCount[] = new int[CHAR_SIZE];

		// Construct character count array from the input text.
		int length = input.length();
		for (int i = 0; i < length; i++)
			characterCount[input.charAt(i)]++;

		int maximumCount = -1; // Initialize max count
		char output = ' '; // Initialize result

		// Iterate the string and get the count of each char
		for (int i = 0; i < length; i++) {
			if (maximumCount < characterCount[input.charAt(i)]) {
				maximumCount = characterCount[input.charAt(i)];
				output = input.charAt(i);
			}
		}

		return output;
	}

	// Driver Method
	public static void main(String[] args) {
		String str = "abbbaacc";
		System.out.println("Max occurring character is " + getMaxOccuringChar(str));
	}
}
