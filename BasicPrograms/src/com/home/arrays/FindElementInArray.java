package com.home.arrays;

public class FindElementInArray {

	public static void main(String[] args) {
		int x = 1;
		int[] a = { 11, 10, 15, 5, 3, 8 };
		boolean isFound= false;
		for (int i = 0; i < a.length; i++) {
			if(x==a[i])
			{
				isFound=true;
				break;
			}			
		}
		if(isFound){
			System.out.println("found");
		}else{
			System.out.println("not found");
		}

	}
}


