package com.snc.common;

public class Assignment1Pattern3 {

	/*
	 *  *************
		****** ******
		*****   *****
		****     ****
		***       ***
		**         **
		*           *
		*           *
		*           *
		*           *
		*           *
		*           *
		*************
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n-1 || j == n-1
						|| i+j <= (n-1)/2 || j-i >= (n-1)/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}