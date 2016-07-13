package com.home.string;

public class FindSubstring {

	public static void main(String[] args) {
		
		//findMe("manasvi","ana");
		System.out.println(find("vivek","viv"));
		
	}

	public static void findMe(String mainString, String subString) {

		if (mainString.contains(subString)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}	
		public static boolean find(String mainString, String subString){
			boolean foundMe=false;
			int max=mainString.length()-subString.length();
			System.out.println(mainString.contains(subString)?"Yes":"No");
			 
		System.out.println(foundMe?"matched":"not Matched");
			
			return foundMe;
			
		}
			
			
			
			
			
		
	}


