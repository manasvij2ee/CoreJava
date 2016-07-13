package com.home.string;

import java.util.StringTokenizer;

public class TokenizeString {

	public static void main(String[] args) {
		String delims = ",";
		String splitString = "one,two,,three,four,,five";
 
		System.out.println("StringTokenizer Example: \n");
		StringTokenizer st = new StringTokenizer(splitString, delims);
		while (st.hasMoreElements()) {
			System.out.println("StringTokenizer Output: " + st.nextElement());
		}
	}

}
