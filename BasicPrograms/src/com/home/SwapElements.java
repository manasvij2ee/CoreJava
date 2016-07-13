package com.home;

public class SwapElements {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		int temp=0;
		System.out.println("before swapping");
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);
		temp=a;
		a=b;
		b=temp;		
		System.out.println("After Swapping");
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);
	}

}
