package com.hackathon;

/**
 * Hello world!
 *
 */
public class NumberArrangement {
	public static void main(String[] args) {
		long number = 1234567;
		String str = Long.toString(number);
		//int firstDigit = Integer.parseInt(Long.toString(number).substring(0, 1));
		//System.out.println(firstDigit);
		//System.out.println(mod);
		System.out.println(getString(str));
		
	}

	private static int getString(String str) {
		int length = str.length();
		int mid = length % 2 == 0 ? length / 2 : length / 2 + 1;
		String modified = null;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < mid; i ++) {
			modified = str.substring(0, i + 1) + str.substring(length - (i + 1)  , length - i);
			//System.out.println(modified.substring(modified.length() - 2));
			sb.append(modified.substring(modified.length() - 2));
		}
		String num = length % 2 == 0 ? sb.toString() : sb.toString().substring(0, length );
		return Integer.parseInt(num);
	}
	
	public static long firstDigit(long n) 
    { 
        // Remove last digit from number 
        // till only one digit is left 
        while (n >= 10)  
            n /= 10; 
      
        // return the first digit 
        return n; 
    } 
  
    // Find the last digit 
   
      
    // driver function 
    
	

}
