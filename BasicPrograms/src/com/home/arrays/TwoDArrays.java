package com.home.arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int a[][]={{2,3,5},{6,7,8}};
		int b[][]={{2,3,4},{6,7,9}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
			int sum= a[i][j]+b[i][j];
			int diff= a[i][j]-b[i][j];
			int mul= a[i][j]*b[i][j];
			System.out.println("Addition of "+a[i][j]+"+"+b[i][j]+":"+sum);
			System.out.println("Substraction of "+a[i][j]+"-"+b[i][j]+":"+diff);
			System.out.println("Multiplication of "+a[i][j]+"*"+b[i][j]+":"+mul);
		
		}
	}
}

}
