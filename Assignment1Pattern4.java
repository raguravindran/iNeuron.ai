package com.snc.common;

public class Assignment1Pattern4 {

  /**        
             
             
             
      *           *
      **         **
      ***       ***
      ****     ****
      *****   *****
      ****** ******
      *************

  **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ( i-j >= (n-1)/2 || j+i >= ((n) + (n-1)/2)-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
