package com.snc.common;

public class PrintNumbers {
	/**
	1 1 1 1 
	2 2 2 2 
	3 3 3 3 
	4 4 4 4 
	**/
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
}
