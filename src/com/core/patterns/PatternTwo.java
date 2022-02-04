package com.core.patterns;

public class PatternTwo {

	public static void patternSixth(int n) {
		
		for(int row = 0; row < n; row++) {
			
			int noOfSpaces = n - row - 1;
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
					
			for(int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}