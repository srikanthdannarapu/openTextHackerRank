package com;
// JAVA program to count occurrences 

// of a character 

class GFG {
	
	public static String replaceCharByOccurence(String text, char c) {
		int number = 0;
		String words[] = text.split(" ");
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == c) {
					number++;
					sb.replace(i, i+1, String.valueOf(number));
				}
			}
			System.out.println(sb.toString());
			number = 0;
		}
		return "".toString();
	}

	// Driver method
	public static void main(String args[]) {
		String str = "opentext internship";
		char c = 'e';
		System.out.println(replaceCharByOccurence(str, c));
	}
}
