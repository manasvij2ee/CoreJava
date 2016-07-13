package com.home.arrays;

public class OneDArrays {

	public static void main(String[] args) {
		int a[]={2,3,5};
		int b[]={2,3,4};
		for (int i = 0; i < a.length; i++) {
			int sum= a[i]+b[i];
			int diff= a[i]-b[i];
			int mul= a[i]*b[i];
			System.out.println("Addition of "+a[i]+"+"+b[i]+":"+sum);
			System.out.println("Substraction of "+a[i]+"-"+b[i]+":"+diff);
			System.out.println("Multiplication of "+a[i]+"*"+b[i]+":"+mul);
		}
		
		
	}

}
